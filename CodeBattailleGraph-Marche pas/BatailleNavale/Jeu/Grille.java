package BatailleNavale.Jeu;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.Map;

import BatailleNavale.Jeu.Bateau;

public class Grille extends JPanel {
    static final int GRID_SIZE = 10;
    private static int x;
    private static int y;
    private JPanel[][] panels = new JPanel[GRID_SIZE][GRID_SIZE];
    private JToggleButton[][] toggleButtons = new JToggleButton[GRID_SIZE][GRID_SIZE];

    public Grille() {
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
        ButtonGroup gridCase = new ButtonGroup();

        for (x = 0; x != GRID_SIZE; x++) {
            for (y = 0; y != GRID_SIZE; y++) {
                panels[x][y] = new JPanel();
                toggleButtons[x][y] = new Case();
                gridCase.add(toggleButtons[x][y]);
                panels[x][y].add(toggleButtons[x][y]);
                add(panels[x][y]);
            }
        }
    }

    public boolean isItSelected(int x, int y) {
        return toggleButtons[x][y].isSelected();
    }

    public void setSelected(int x, int y, boolean selected) {
        toggleButtons[x][y].setSelected(selected);
    }

    public Case whoIsSelected(int x,int y){
        return (Case) toggleButtons[x][y];
    }
    public static String IsABoatDead(Case[][] tab,boolean DesExist,boolean CruExist,boolean SubExist,boolean BattExist,boolean CarrExist){
        int compteur = 0;
        int DestroyerCompte=0;
        int CruiserCompte=0;
        int SubmarineCompte=0;
        int BattleshipCompte=0;
        int CarrierCompte=0;
        for(x=0;x != GRID_SIZE;x++){
            for(y=0;y!=GRID_SIZE;y++){
                if (!Objects.equals(tab[x][y].getAppartenance(), "Mer")){

                    if (Objects.equals(tab[x][y].getAppartenance(), "destroyer")){
                        DestroyerCompte++;
                    }
                    if (Objects.equals(tab[x][y].getAppartenance(), "cruiser")){
                        CruiserCompte++;
                    }
                    if (Objects.equals(tab[x][y].getAppartenance(), "submarine")){
                        SubmarineCompte++;
                    }
                    if (Objects.equals(tab[x][y].getAppartenance(), "battleship")){
                        BattleshipCompte++;
                    }
                    if (Objects.equals(tab[x][y].getAppartenance(), "carrier")){
                        CarrierCompte++;
                    }
                }

            }
        }
        if(BattleshipCompte==0 && BattExist){
            System.out.println("Battleship coulé ! +200");
            return "battleship";
        }
        if(CruiserCompte==0 && CruExist){
            System.out.println("Cruiser coulé ! +100");
            return "cruiser";
        }
        if (SubmarineCompte== 0 && SubExist){
            System.out.println("Submarine coulé ! +100");
            return "submarine";
        }
        if (DestroyerCompte==0 && DesExist){
            System.out.println("Destroyer coulé ! +50");
            return "destroyer";
        }
        if (CarrierCompte==0 && CarrExist){
            System.out.println("Carrier coulé ! +250");
            return "carrier";
        }
        return "no";
    }

    public boolean Unusable(String name,int des,int sub, int cruis,int ship, int carrier){
        if(Objects.equals(name, "destroyer") && des==1){
            return false;
        }else{
            if(Objects.equals(name, "submarine") && sub == 1){
                return false;
            }else {
                if(Objects.equals(name, "cruiser") && cruis==1){
                    return false;
                }else{
                    if(Objects.equals(name, "battleship") && ship==1){
                        return false;
                    }else{
                        if(Objects.equals(name, "carrier") && carrier==1){
                            return false;
                        }else{
                            return true;}
                    }
                }
            }
        }
    }
    public void addBoat(int x, int y,String name,int size, String orientation , int des,int sub, int cruis,int ship, int carrier){
        if ((orientation == "H" || orientation == "h") && ! Unusable(name,des,sub,cruis,ship,carrier)){
            for (int i = y; i < y + size; i++){
                panels[x][i].remove(toggleButtons[x][i]);
                toggleButtons[x][i]=new Bateau(name,orientation,x,y);
                panels[x][i].add(toggleButtons[x][i]);
            }
        }
        if ((orientation == "V" || orientation == "v") && ! Unusable(name,des,sub,cruis,ship,carrier)){
            for (int j = x; j < x + size; j++){
                panels[j][y].remove(toggleButtons[j][y]);
                toggleButtons[j][y]=new Bateau(name,orientation,x,y);
                panels[j][y].add(toggleButtons[j][y]);
            }
        }

        /*
        if(Objects.equals(orientation, "H") || Objects.equals(orientation, "h")){
            maxY=10-size;
        }
        if(Objects.equals(orientation, "V") || Objects.equals(orientation, "v")) {
            maxX=10-size;
        }*/
    }
}