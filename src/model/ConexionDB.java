package model;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ConexionDB {

    private static Connection conexion = null;
    private static ConexionDB instancia;
    private int id;
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }

    private ConexionDB() {
    }
    
    public static ConexionDB getInstancia(){
        if(instancia == null){
            instancia = new ConexionDB();
        }
        return instancia;
    }
    
    public Connection conectarDB(UrlDB db) throws SQLException{
        String url = "jdbc:mysql://" + db.getLocalHost() + ":" + db.getPuerto() + "/" + db.getBaseDeDatos();
        String user = db.getUsuario();
        String password = db.getContraseña();
        
        System.out.println(url);
        
        try{
            conexion = DriverManager.getConnection(url, user, password);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa.");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error");
            conexion.close();
        }
        return conexion;
    }
    
    public void mostrar(TableModel model) throws SQLException{
        DefaultTableModel modelo = (DefaultTableModel) model;
        modelo.setNumRows(0);
        
        for(Serie serie : obtenerProducto()){
            String precioModificado = "$ " + serie.getPrecioAlquiler();
            modelo.addRow(new Object[]{
                serie.getId(),
                serie.getTitulo(),
                serie.getDescripcion(),
                serie.getFechaEstreno(),
                serie.getEstrellas(),
                serie.getGenero(),
                precioModificado,
                serie.getAtp(),
                serie.getEstado()
            });
        }
    }
    
    public static ArrayList<Serie> obtenerProducto() throws SQLException{
        ArrayList<Serie> resultado = new ArrayList<>();
        
        String url = "jdbc:mysql://" + model.UrlDB.localHost + ":" + model.UrlDB.puerto + "/" + model.UrlDB.baseDeDatos;
        String user = model.UrlDB.usuario;
        String password = model.UrlDB.contraseña;
        
        Connection c = DriverManager.getConnection(url,user,password);
        
        try {
            PreparedStatement sql = c.prepareStatement("SELECT * FROM serie");
            ResultSet res = sql.executeQuery();
            while(res.next()){
                Serie serie = new Serie();
                serie.setId(res.getInt("id"));
                serie.setTitulo(res.getString("titulo"));
                serie.setDescripcion(res.getString("descripcion"));
                serie.setFechaEstreno(res.getString("fechaEstreno"));
                serie.setEstrellas(res.getInt("estrellas"));
                serie.setGenero(res.getString("genero"));
                serie.setPrecioAlquiler(res.getDouble("precioAlquiler"));
                serie.setAtp(res.getBoolean("apt"));
                serie.setEstado(res.getString("estado"));
                resultado.add(serie);
                System.out.println(serie.getFechaEstreno());
            }
        } catch (Exception e) {
            System.out.println("Error en Obtener: " + e);
        }finally{
            c.close();
        }
        return resultado;
    }
    
    public void nuevo(String titulo, String descripcion, String fechaEstreno, int estrellas, String genero, double precioAlquiler, boolean atp, String estado) throws SQLException{       
        Serie serie = new Serie(titulo,descripcion,fechaEstreno,estrellas,genero,precioAlquiler,atp,estado);
        
        String url = "jdbc:mysql://" + model.UrlDB.localHost + ":" + model.UrlDB.puerto + "/" + model.UrlDB.baseDeDatos;
        String user = model.UrlDB.usuario;
        String password = model.UrlDB.contraseña;
        
        Connection c = DriverManager.getConnection(url,user,password);
        
        try{
            PreparedStatement sql = c.prepareStatement("INSERT INTO serie (titulo,descripcion,fechaEstreno,estrellas,genero,precioAlquiler,apt,estado) VALUES(?,?,?,?,?,?,?,?)");
            sql.setString(1, serie.getTitulo());
            sql.setString( 2, serie.getDescripcion());
            sql.setString(3, serie.getFechaEstreno());
            sql.setInt(4, serie.getEstrellas());
            sql.setString(5, serie.getGenero());
            sql.setDouble(6, serie.getPrecioAlquiler());
            sql.setBoolean(7, serie.getAtp());
            sql.setString(8, serie.getEstado());
            sql.executeUpdate();
        }catch(Exception e){
            System.out.println(serie.getTitulo());
            System.out.println("Error en agregar: " + e);
        }finally{
            c.close();
        }
    }
    
    public void modificar(int id,String titulo, String descripcion, String fechaEstreno, int estrellas, String genero, double precioAlquiler, boolean atp, String estado) throws SQLException{
        Serie serie = new Serie(titulo,descripcion,fechaEstreno,estrellas,genero,precioAlquiler,atp,estado);
        
        String url = "jdbc:mysql://" + model.UrlDB.localHost + ":" + model.UrlDB.puerto + "/" + model.UrlDB.baseDeDatos;
        String user = model.UrlDB.usuario;
        String password = model.UrlDB.contraseña;
        
        Connection c = DriverManager.getConnection(url,user,password);
        System.out.println(id);
        try{
            PreparedStatement sql = c.prepareStatement("UPDATE serie SET titulo=?,descripcion=?,fechaEstreno=?,estrellas=?,genero=?,precioAlquiler=?,apt=? WHERE id=" + id);
            sql.setString(1, serie.getTitulo());
            sql.setString( 2, serie.getDescripcion());
            sql.setString(3, serie.getFechaEstreno());
            sql.setInt(4, serie.getEstrellas());
            sql.setString(5, serie.getGenero());
            sql.setDouble(6, serie.getPrecioAlquiler());
            sql.setBoolean(7, serie.getAtp());
            sql.executeUpdate();
        }catch(Exception e){
            System.out.println("Error en modificar: " + e);
        }finally{
            c.close();
        }
    }
    
    public void anularActivar(int id, String estado) throws SQLException{
        String url = "jdbc:mysql://" + model.UrlDB.localHost + ":" + model.UrlDB.puerto + "/" + model.UrlDB.baseDeDatos;
        String user = model.UrlDB.usuario;
        String password = model.UrlDB.contraseña;
        
        Connection c = DriverManager.getConnection(url,user,password);
        System.out.println(id);
        try{
            PreparedStatement sql = c.prepareStatement("UPDATE serie SET estado=? WHERE id=" + id);
            sql.setString(1, estado);
            sql.executeUpdate();
        }catch(Exception e){
            System.out.println("Error en modificar: " + e);
        }finally{
            c.close();
        }
    }
    
    public void eliminar(int id) throws SQLException{        
        String url = "jdbc:mysql://" + model.UrlDB.localHost + ":" + model.UrlDB.puerto + "/" + model.UrlDB.baseDeDatos;
        String user = model.UrlDB.usuario;
        String password = model.UrlDB.contraseña;
        
        Connection c = DriverManager.getConnection(url,user,password);
        try{
            PreparedStatement sql = c.prepareStatement("DELETE FROM serie WHERE id=" + id);
            sql.executeUpdate();
        }catch(Exception e){
            System.out.println("Error en eliminar: " + e);
        }finally{
            c.close();
        }
    }
    
    public void buscar(Serie serie,int id) throws SQLException{
        String url = "jdbc:mysql://" + model.UrlDB.localHost + ":" + model.UrlDB.puerto + "/" + model.UrlDB.baseDeDatos;
        String user = model.UrlDB.usuario;
        String password = model.UrlDB.contraseña;
        
        Connection c = DriverManager.getConnection(url,user,password);
        
        try{
            PreparedStatement sql = c.prepareStatement("select * from serie WHERE id=" + id);
            sql.setString(1, serie.getTitulo());
            sql.setString( 2, serie.getDescripcion());
            sql.setString(3, serie.getFechaEstreno());
            sql.setInt(4, serie.getEstrellas());
            sql.setString(5, serie.getGenero());
            sql.setDouble(6, serie.getPrecioAlquiler());
            sql.setBoolean(7, serie.getAtp());
            sql.executeUpdate();
        }catch(Exception e){
            System.out.println("Error en agregar: " + e);
        }finally{
            c.close();
        }
    }
    
}
