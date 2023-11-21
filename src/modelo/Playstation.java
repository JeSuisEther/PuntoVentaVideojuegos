package modelo;

public class Playstation extends Videojuego {
    private String inmersion;
    private String playstationnow;

    public String getInmersion() {
        return inmersion;
    }

    public void setInmersion(String inmersion) {
        this.inmersion = inmersion;
    }

    public String getPlaystationnow() {
        return playstationnow;
    }

    public void setPlaystationnow(String playstationnow) {
        this.playstationnow = playstationnow;
    }
    
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info+= "Inmersion VR: " + getInmersion() + "\n" + "PlayStation Now: " + getPlaystationnow();
        return info;
    }
}
