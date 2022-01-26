package com.example.mypays;

public class pays {
    private String nom;
    private int drapeau;
    private int superficie;
    private int photo;
    private String capital;

    public pays(String nom, int drapeau, int superficie, int photo, String capital){
        this.nom=nom;
        this.drapeau=drapeau;
        this.superficie=superficie;
        this.capital=capital;
        this.photo=photo;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDrapeau() {
        return drapeau;
    }

    public void setDrapeau(int drapeau) {
        this.drapeau = drapeau;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPhoto()
    {
        return photo;
    }

    public void setPhoto(int photo)
    {
        this.photo = photo;
    }

    public String getCapital()
    {
        return capital;
    }

    public void setCapital(String capital)
    {
        this.capital = capital;
    }
}
