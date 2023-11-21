package modelo;

public class Videojuego {
   
    private String clave;
    private String titulo;
    private String genero;
    private String publico;
    private String precio;

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPublico() {
        return publico;
    }

    public void setPublico(String publico) {
        this.publico = publico;
    }


    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
   public String mostrarInfo(){
       String info = "Clave: " + getClave() + "\n" + "Título: " + getTitulo() + "\n" +
               "Género: " + getGenero() + "\n" + "Público" + getPublico() + "\n"
               + "Precio: " + getPrecio();
        return info;
               }
}
