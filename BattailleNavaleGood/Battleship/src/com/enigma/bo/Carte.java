package com.enigma.bo;

public class Carte {
    int nbcol;
    int nblin;
    Cellule[][] carte;
    Cellule[][] carteOrdi;

    public Carte(int n, int p) {
        nbcol = p;
        nblin = n;

        carte = new Cellule[nbcol][nblin];
        carteOrdi = new Cellule[nbcol][nblin];

        for (int i = 0; i < nbcol; i++) {
            for (int j = 0; j < nblin; j++) {
                 carte[i][j] = new Cellule(i,j,null,null);
            }

        }
        for (int k = 0; k < nbcol; k++) {
            for (int l = 0; l < nblin; l++) {
                carteOrdi[k][l] = new Cellule(k,l,null,null);
            }

        }
    }


    public void afficher() {
        char[] coordonnees = {'0','1','2','3','4','5','6','7','8', '9'};
        System.out.print("   ");
        for(int a = 0 ; a<10; a ++){
            System.out.print(" "+ a + " |");
        }
        System.out.println();

        for (int i = 0; i < nbcol; i++) {
            System.out.print(coordonnees[i]);
            for (int j = 0; j < nblin; j++) {
                System.out.print(" | "+carte[i][j]);
            }
            System.out.println(" | ");
        }
    }

    public void afficherOrdi() {
        char[] coordonnees = {'0','1','2','3','4','5','6','7','8', '9'};
        System.out.print("   ");
        for(int a = 0 ; a<10; a ++){
            System.out.print(" "+ a + " |");
        }
        System.out.println();

        for (int i = 0; i < nbcol; i++) {
            System.out.print(coordonnees[i]);
            for (int j = 0; j < nblin; j++) {
                System.out.print(" | "+carteOrdi[i][j]);
            }
            System.out.println(" | ");
        }
    }


}
