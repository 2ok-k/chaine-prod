package org.example;

public class Piece {
    private String nom;
    private double tempsUsinage;
    private double tauxPanne;

    public Piece(String nom, double tempsUsinage, double tauxPanne) {
        this.nom = nom;
        this.tempsUsinage = tempsUsinage;
        this.tauxPanne = tauxPanne;
    }

    public String getNom() {
        return nom;
    }

    public double getTempsUsinage() {
        return tempsUsinage;
    }

    public double getTauxPanne() {
        return tauxPanne;
    }
}
