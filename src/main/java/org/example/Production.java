package org.example;

public class Production {
    public static void main(String[] args) {
        Machine machineTete = new Machine("MT", 2.0, 0.25);
        Machine machineJupe = new Machine("MJ", 3.0, 0.25);
        Machine machineAxe = new Machine("MA", 2.5, 0.25);
        Machine machinePrincipale = new Machine("MP", 1.0, 0.25);

        int pistonsAssembles = 0;
        while (pistonsAssembles < 100) {
            // Fabrication d'une pièce de chaque type
            Piece tete = new Piece("Tête");
            Piece jupe = new Piece("Jupe");
            Piece axe = new Piece("Axe");

            // Usinage des pièces
            machineTete.usinerPiece(tete);
            machineJupe.usinerPiece(jupe);
            machineAxe.usinerPiece(axe);

            // Vérification des pannes et réparations
            if (machineTete.estEnPanne()) {
                machineTete.reparerMachine();
            }
            if (machineJupe.estEnPanne()) {
                machineJupe.reparerMachine();
            }
            if (machineAxe.estEnPanne()) {
                machineAxe.reparerMachine();
            }

            // Assemblage du piston
            machinePrincipale.usinerPiece(tete);
            machinePrincipale.usinerPiece(jupe);
            machinePrincipale.usinerPiece(axe);

            System.out.println("Piston(s) assemblé(s) " + (pistonsAssembles + 1));
            pistonsAssembles++;
        }

        System.out.println("Les 100 pistons ont été assemblés avec succès!.");
    }
}
