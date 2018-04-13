package com.example.compu.capyfinder;

public class Item {
    private String pais;
    private String capital;
    private String gentilicio;
    private String country;
    private String capytal;
    private String gentilic;
    private int img;


    public Item(String pais, String capital, String gentilicio, int img, String country, String capytal, String gentilic) {
        this.pais = pais;
        this.capital = capital;
        this.gentilicio = gentilicio;
        this.img = img;
        this.country=country;
        this.capytal=capytal;
        this.gentilic=gentilic;
    }

    //FUNCIONES GET
    public String getPais() {
        return pais;
    }
    public String getCapital() {
        return capital;
    }
    public String getGentilicio() {
        return gentilicio;
    }
    public int getImg() {
        return img;
    }
    public String getCountry() {return country;}
    public String getCapytal() {return capytal;}
    public String getGentilic() {return gentilic;}

    //FUNCIONES SET
    public void setCapital(String capital) {
        this.capital = capital;
    }
    public void setGentilicio(String gentilicio) {
        this.gentilicio = gentilicio;
    }
    public void setPais(String pais) {this.pais = pais;}
    public void setImg(int img) {
        this.img = img;
    }
    public void setCountry(String country) {this.country = country;}
    public void setCapytal(String capytal) {this.capytal = capytal;}
    public void setGentilic(String gentilic) {this.gentilic = gentilic;}
}
