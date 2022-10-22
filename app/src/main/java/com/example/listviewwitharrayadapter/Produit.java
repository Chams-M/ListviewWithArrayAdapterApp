package com.example.listviewwitharrayadapter;

public class Produit {
    int id;
    String intitule;
    String designation;
    double prix;
    int quantite;

    public Produit(int id, String intitule, String designation, double prix, int quantite) {
        this.id = id;
        this.intitule = intitule;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", intitule='" + intitule + '\'' +
                ", designation='" + designation + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
