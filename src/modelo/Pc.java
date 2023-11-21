package modelo;

public class Pc extends Videojuego {
    private String distribucion;
    private String gamaalta;

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public String getGamaalta() {
        return gamaalta;
    }

    public void setGamaalta(String gamaalta) {
        this.gamaalta = gamaalta;
    }
    
    @Override
    public String mostrarInfo (){
        String info = super.mostrarInfo();
        info+= "Plataforma de distribución: " + getDistribucion() + "\n" + "Exclusivo Gama Alta" + getGamaalta();
        return info;
    }
}
