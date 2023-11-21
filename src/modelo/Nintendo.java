package modelo;


public class Nintendo extends Videojuego {
    private String modorecomendado;
    private String amiibocompatible;

    public String getModorecomendado() {
        return modorecomendado;
    }

    public void setModorecomendado(String modorecomendado) {
        this.modorecomendado = modorecomendado;
    }

    public String getAmiibocompatible() {
        return amiibocompatible;
    }

    public void setAmiibocompatible(String amiibocompatible) {
        this.amiibocompatible = amiibocompatible;
    }
    
    @Override
    public String mostrarInfo(){
        String info = super.mostrarInfo();
        info+= "Modo recomendado: " + getModorecomendado() + "\n" + "Amiibo compatible: " + getAmiibocompatible();
                return info;
    }
}
