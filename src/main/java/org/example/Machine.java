package org.example;

import java.util.Random;

public class Machine {
    String nom;
    double tempsUsinage;
    double chancePanne;

    public Machine(String nom, double tempsUsinage, double chancePanne) {
        this.nom = nom;
        this.tempsUsinage = tempsUsinage;
        this.chancePanne = chancePanne;
    }

    // Usiner une pièce
    public void usinerPiece(Piece piece) {
        System.out.println("La machine " + nom + " usine une pièce de type " + piece.type);
        try {
            Thread.sleep((long)(tempsUsinage * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Vérifier si la machine tombe en panne
    public boolean estEnPanne() {
        Random rand = new Random();
        double valeurAleatoire = rand.nextDouble();
        return valeurAleatoire <= chancePanne;
    }

    //Réparer une machine
    public void reparerMachine() {
        System.out.println("La machine " + nom + " est en panne et en cours de réparation...");
        try {
            Thread.sleep((long)((5 + Math.random() * 6) * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("La machine " + nom + " a été réparée.");
    }
}
