package org.example;

public class Production {
    public static void main(String[] args) {
        long debutSimulation = System.currentTimeMillis();

        Machine mTete = new Machine("MT", 2.0, 0.25);
        Machine mJupe = new Machine("MJ", 3.0, 0.25);
        Machine mAxe = new Machine("MA", 2.5, 0.25);
        Machine mPrincipale = new Machine("MP", 1.0, 0.25);

        int pistonsAssembles = 0;
        while (pistonsAssembles < 100) {
            Piece tete = new Piece("Tête");
            Piece jupe = new Piece("Jupe");
            Piece axe = new Piece("Axe");

            mTete.usinerPiece(tete);
            mJupe.usinerPiece(jupe);
            mAxe.usinerPiece(axe);

            if (mTete.estEnPanne()) {
                mTete.reparerMachine();
            }
            if (mJupe.estEnPanne()) {
                mJupe.reparerMachine();
            }
            if (mAxe.estEnPanne()) {
                mAxe.reparerMachine();
            }
            if (mPrincipale.estEnPanne()) {
                mPrincipale.reparerMachine();
            }

            mPrincipale.usinerPiece(tete);
            mPrincipale.usinerPiece(jupe);
            mPrincipale.usinerPiece(axe);

            System.out.println("Piston assemblé " + (pistonsAssembles + 1));
            pistonsAssembles++;
        }

        long finSimulation = System.currentTimeMillis();
        long tempsTotal = finSimulation - debutSimulation;
        double tempsTotalEnMinutes = tempsTotal / 60000.0;

        System.out.println("Les 100 pistons ont été assemblés en " + tempsTotalEnMinutes + " minutes.");
    }
}
