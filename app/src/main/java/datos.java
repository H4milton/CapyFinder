public class datos {

    private String pais;
    private String capital;
    private String gentilicio;
    private String img;

    public datos(String pais, String capital, String gentilicio, String img) {
        this.pais = pais;
        this.capital = capital;
        this.gentilicio = gentilicio;
        this.img = img;
    }

    public String getPais(){
        return pais;
    }

    public String getCapital(){
        return capital;
    }

    public String getGentilicio(){
        return gentilicio;
    }

    public void setCapital(String rcapital){
        this.capital = rcapital;
    }

    public void setPais(String rpais){
        this.capital = rpais;
    }

    public void setGentilicio(String rgentilicio){
        this.capital = rgentilicio;
    }

}
