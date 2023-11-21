package model;

public class UrlDB {

    public static String localHost;
    public static String puerto;
    public static String baseDeDatos;
    public static String usuario;
    public static String contraseña;

    public UrlDB(String localHost, String puerto, String baseDeDatos, String usuario, String contraseña) {
        this.localHost = localHost;
        this.puerto = puerto;
        this.baseDeDatos = baseDeDatos;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getLocalHost() {
        return localHost;
    }

    public void setLocalHost(String localHost) {
        this.localHost = localHost;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(String baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
