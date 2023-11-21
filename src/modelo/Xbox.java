package modelo;


public class Xbox extends Videojuego {
    private String retrocompatibilidad;
    private String gamepass;

    public String getRetrocompatibilidad() {
        return retrocompatibilidad;
    }

    public void setRetrocompatibilidad(String retrocompatibilidad) {
        this.retrocompatibilidad = retrocompatibilidad;
    }

    public String getGamepass() {
        return gamepass;
    }

    public void setGamepass(String gamepass) {
        this.gamepass = gamepass;
    }
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info+= "Retrocompatibilidad con: " + getRetrocompatibilidad() + "\n" + "GamePass: " + getGamepass();
        return info;
    }
    
}
