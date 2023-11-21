package model;

public class Serie {

    int id;
    String titulo;
    String descripcion;
    String fechaEstreno;
    int estrellas;
    String genero;
    double precioAlquiler;
    boolean atp;
    String estado;
    
    public Serie(){}

    public Serie(String titulo, String descripcion, String fechaEstreno, int estrellas, String genero, double precioAlquiler, boolean atp, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaEstreno = fechaEstreno;
        this.estrellas = estrellas;
        this.genero = genero;
        this.precioAlquiler = precioAlquiler;
        this.atp = atp;
        this.estado = estado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public boolean getAtp() {
        return atp;
    }

    public void setAtp(boolean atp) {
        this.atp = atp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
}
