package com.gestion_fournisseurs.model;

public class Fournisseur {
    private String nom;
    private String email;

    public Fournisseur() {}

    public Fournisseur(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Fournisseur{nom='" + nom + "', email='" + email + "'}";
    }
}
