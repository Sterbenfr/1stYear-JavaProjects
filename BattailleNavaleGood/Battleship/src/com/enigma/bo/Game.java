package com.enigma.bo;

import com.enigma.gui.MyWindow;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

import static java.lang.Math.*;

public class Game{

    public static final int PORTE_AVION = 5;
    public static final int CROISEUR = 4;
    public static final int CONTRE_TORPILLEUR = 3;
    public static final int TORPILLEUR = 2;
    public static final int[] mesbateaux = {PORTE_AVION, CROISEUR, CONTRE_TORPILLEUR, CONTRE_TORPILLEUR, TORPILLEUR};
    public static final int[] bateauOrdi = {PORTE_AVION, CROISEUR, CONTRE_TORPILLEUR, CONTRE_TORPILLEUR, TORPILLEUR};
    int x;
    int y;
    boolean orientation = true;
    int indexbateaux = 0;
    int indexBateauOrdi = 0;
    int pointVie = 17;
    int pointVieOrdi = 17;

    boolean result = false;
    Bateau monBateau;
    Carte maCarte;
    Carte carteOrdi;
    MyWindow window;
    ActionButton button;
    Game jeu;

    public void launch() {
        System.out.println("\n Bienvenue sur le jeu de bataille navale !");
        maCarte = new Carte(10, 10);
        carteOrdi = new Carte(10,10);
        maCarte.afficher();
        System.out.println(" ");
        carteOrdi.afficher();


    }

    public int[] getEntreeUtilisateur(int coord,int y, MyWindow window) throws Exception {
        /*Scanner entree = new Scanner(System.in);
        System.out.println("Entrer les coordonnées du bateau " + mesbateaux[indexbateaux] + " : ");
        String temp = entree.next();
        char xTemp = temp.charAt(0);
        char yTemp = temp.charAt(1);
        x = Integer.parseInt("" + xTemp);
        y = Integer.parseInt("" + yTemp);
        System.out.println("Entrer l'orientation du bateau ( 1 pour vertical et 0 pour horizontal ) :");
        String tempOrientation = entree.next();
        orientation = Integer.parseInt(tempOrientation);
        int coordx = x;
        int coordy = y;
*/
        monBateau = new Bateau(x, y, false, mesbateaux[indexbateaux]);

        int x;

        if (coord < 10){
            y = coord;
            x = 0;
        } else{
            x = coord / 10;
            y = coord - (x * 10);
        }


        if (check()){
                if (orientation != true && orientation != true) {
                    throw new Exception();
                }
                if (orientation == false) {

                for (int i = 0; i < mesbateaux[indexbateaux]; i++) {
                    if (y > 9 || y < 0 || (maCarte.carte[x][y].getBateau(monBateau) != null)) {
                        window.buttonColor(coord,y);
                        throw new Exception();
                    }
                    maCarte.carte[x][y].setBateau(monBateau);
                    window.buttonColor(coord,y);
                    y++;
                }
            } else {
                for (int i = 0; i < mesbateaux[indexbateaux]; i++) {
                    if ((x > 9) || (x < 0) || (maCarte.carte[x][y].getBateau(monBateau) != null)) {
                        window.buttonColor(coord,y);
                        throw new Exception();
                    }
                    maCarte.carte[x][y].setBateau(monBateau);
                    window.buttonColor(x,y);
                    x++;
                }
            }
        }


        indexbateaux++;
        maCarte.afficher();
        return null;
    }

    /*
    public int[] getEntreeUtilisateur() throws Exception {
        Scanner entree = new Scanner(System.in);
        System.out.println("Entrer les coordonnées du bateau " + mesbateaux[indexbateaux] + " : ");
        String temp = entree.next();
        char xTemp = temp.charAt(0);
        char yTemp = temp.charAt(1);
        x = Integer.parseInt("" + xTemp);
        y = Integer.parseInt("" + yTemp);
        System.out.println("Entrer l'orientation du bateau ( 1 pour vertical et 0 pour horizontal ) :");
        String tempOrientation = entree.next();
        orientation = Integer.parseInt(tempOrientation);
        int coordx = x;
        int coordy = y;

        monBateau = new Bateau(x, y, orientation, mesbateaux[indexbateaux]);

        if (check()){
                x = coordx;
                y = coordy;

                if (orientation != 0 && orientation != 1) {
                    throw new Exception();
                }
                if (orientation == 0) {

                for (int i = 0; i < mesbateaux[indexbateaux]; i++) {
                    if (y > 9 || y < 0 || (maCarte.carte[x][y].getBateau(monBateau) != null)) {
                        throw new Exception();
                    }
                    maCarte.carte[x][y].setBateau(monBateau);
                    y++;
                }
            } else {
                for (int i = 0; i < mesbateaux[indexbateaux]; i++) {
                    if ((x > 9) || (x < 0) || (maCarte.carte[x][y].getBateau(monBateau) != null)) {
                        throw new Exception();
                    }
                    maCarte.carte[x][y].setBateau(monBateau);
                    x++;
                }

            }
        }

        indexbateaux++;
        maCarte.afficher();
        return null;
    }
    */
    public boolean check() throws Exception {
        if (orientation != false) {
            if (orientation == false && orientation != true) {
                throw new Exception();
            }
            for (int i = 0; i < mesbateaux[indexbateaux]; i++) {
                if (y > 9 || y < 0 || (maCarte.carte[x][y].getBateau(monBateau) != null)) {
                    result = false;
                    throw new Exception();

                }
                result = true;
                y++;
            }
        } else {
            for (int i = 0; i < mesbateaux[indexbateaux]; i++) {
                if (x > 9 || x < 0 || (maCarte.carte[x][y].getBateau(monBateau) != null)) {
                    result = false;
                    throw new Exception();
                }
                result = true;
                x++;

            }
        }
        return result;
    }



    public boolean getEntreeOrdi(int indexBateau) throws Exception {
        x = (int) (Math.random()*10);
        y = (int) (Math.random()*10);
        //orientation = () Math.random();

        if (checkOrdi(indexBateau)) {
            Bateau ordiBateau = new Bateau(x, y, orientation, bateauOrdi[indexBateau]);
            if (orientation == false) {
                for (int i = 0; i < bateauOrdi[indexBateau]; i++) {
                    carteOrdi.carteOrdi[x][y].setBateauOrdi(ordiBateau);
                    y++;
                }
            } else {
                for (int i = 0; i < bateauOrdi[indexBateau]; i++) {
                    carteOrdi.carteOrdi[x][y].setBateauOrdi(ordiBateau);
                    x++;
                }
            }
        } else {
            return false;
        }

        return true;
    }

    private boolean checkOrdi(int indexBateaux) throws Exception {
        boolean result = true;

        int tempX  = x;
        int tempY = y;
        if (orientation == false) {


            for (int i = 0; i < bateauOrdi[indexBateaux]; i++) {
                if (tempY > 9 || tempY < 0 || (carteOrdi.carteOrdi[tempX][tempY].getBateauOrdi() != null)) {
                    result = false;
                    break;
                }

                tempY++;
            }
        } else {
            for (int i = 0; i < bateauOrdi[indexBateaux]; i++) {
                if ((tempX > 9) || (tempX < 0) || (carteOrdi.carteOrdi[tempX][tempY].getBateauOrdi() != null)) {
                    result = false;
                    break;
                }
                tempX++;
            }
        }
        if (result) {
        }
        return result;
    }

    public boolean shoot(int coord){
        boolean result = false;
        Scanner tr = new Scanner(System.in);
        System.out.println("coordonnées du tir : ");
        String str = tr.next();
        char coordonnéesX = str.charAt(0);
        char coordonnéesY = str.charAt(1);
        x = Integer.parseInt("" + coordonnéesX);
        y = Integer.parseInt("" + coordonnéesY);
        ;
        Tir monTir = new Tir(coordonnéesX, coordonnéesY);
        if (carteOrdi.carteOrdi[x][y].getBateauOrdi() == null) {
            System.out.println("Dommage c'est raté");
        }
        if (carteOrdi.carteOrdi[x][y].getBateauOrdi() != null && carteOrdi.carteOrdi[x][y].getMonTir() == null)  {
            System.out.println("Touché !");
            pointVieOrdi --;
            System.out.println(pointVieOrdi + "  vie(s) restante(s)");
        }
        if(pointVieOrdi == 0){
            System.out.println("c'est gagné !");
            System.exit(0);
        }
        carteOrdi.carteOrdi[x][y].setMonTir(monTir);
        carteOrdi.afficherOrdi();
        System.out.println(" ");
        maCarte.afficher();

        return result;
    }


/*
    public boolean shoot(){
        boolean result = false;
        Scanner tr = new Scanner(System.in);
        System.out.println("coordonnées du tir : ");
        String str = tr.next();
        char coordonnéesX = str.charAt(0);
        char coordonnéesY = str.charAt(1);
        x = Integer.parseInt("" + coordonnéesX);
        y = Integer.parseInt("" + coordonnéesY);
        ;
        Tir monTir = new Tir(coordonnéesX, coordonnéesY);
        if (carteOrdi.carte[x][y].getBateauOrdi() == null) {
            System.out.println("Dommage c'est raté");
        }
        if (carteOrdi.carte[x][y].getBateauOrdi() != null && carteOrdi.carte[x][y].getMonTir() == null)  {
            System.out.println(pointVieOrdi + "  vie(s) restante(s)");
            System.out.println("Touché !");
            pointVieOrdi --;
        }
        if(pointVieOrdi == 0){
            System.out.println("c'est gagné !");
            System.exit(0);
        }
        carteOrdi.carte[x][y].setMonTir(monTir);
        carteOrdi.afficherOrdi();
        System.out.println(" ");
        maCarte.afficher();

        return result;
    }
*/
}

