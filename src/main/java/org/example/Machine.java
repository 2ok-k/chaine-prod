package org.example;

public class Machine {
    private String nom;
    private double tempsReparation;
    private double tauxPanne;
    private boolean enMarche;

    public Machine(String nom, double tempsReparation, double tauxPanne) {
        this.nom = nom;
        this.tempsReparation = tempsReparation;
        this.tauxPanne = tauxPanne;
        this.enMarche = true;
    }

    public String getNom() {
        return nom;
    }

    public double getTempsReparation() {
        return tempsReparation;
    }

    public double getTauxPanne() {
        return tauxPanne;
    }

    public boolean estEnMarche() {
        return enMarche;
    }

    public void setEnMarche(boolean enMarche) {
        this.enMarche = enMarche;
    }

    public void effectuerMaintenance() {
        // Simuler la maintenance de la machine
        enMarche = true;
    }

    public void tomberEnPanne() {
        // Simuler une panne de la machine
        enMarche = false;
    }
}
