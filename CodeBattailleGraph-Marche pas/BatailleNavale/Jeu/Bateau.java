package BatailleNavale.Jeu;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

public class Bateau extends Case {
    private  int size = 0;
    private  String orientation = null;

    private int x;

    private int y;

    public Bateau(String name, String orientation,int x,int y) {
        super();
        setEtat("Bateau");
        size = setSizeFromName(name);
        this.orientation = orientation;
        this.x=x;
        this.y=y;
    }

    public int setSizeFromName(String name){
        return switch (name) {
            case "destroyer" -> 2;
            case "submarine" -> 3;
            case "cruiser" -> 3;
            case "battleship" -> 4;
            case "carrier" -> 5;
            default -> 0;
        };
    }

    public static boolean ThereIsAlreadyABoatH(Grille grid, int posx,int posy,int size1){
        for (int i = posy; i < posy + size1; i++){
            if (Objects.equals(grid.whoIsSelected(posx, i).getEtat(), "Bateau")){
                return true;
            }
        }
        return false;
    }
    public static boolean ThereIsAlreadyABoatV(Grille grid, int posx,int posy,int size2){
        for (int i = posx; i < posx + size2; i++){
            if (Objects.equals(grid.whoIsSelected(i, posy).getEtat(), "Bateau")){
                return true;
            }
        }
        return false;
    }
    public int getSizeBoat() {
        return size;
    }




    public static void Shoot(Case[][] tabCase, int posX, int posY){
        String etat =tabCase[posX][posY].getEtat();
        if (Objects.equals(etat, "water")){
            tabCase[posX][posY].setEtat("TirMort");
        }else if(Objects.equals(etat, "Bateau")){
            System.out.println("Touché !");
            tabCase[posX][posY].setEtat("SunkenShip");
            tabCase[posX][posY].setAppartenance("Mer");
        }
    }


}

