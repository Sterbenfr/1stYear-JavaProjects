package com.enigma.bo;

import static com.enigma.bo.Game.bateauOrdi;

public class Tir {

    int x;
    int y;
    Bateau bateau;
    Tir monTir;
    Game mygame;


    public Tir (int x, int y){
        this.x = x;
        this.y = y;

    }

    public Bateau getBateau() { return bateau; }

    public void setBateau(Bateau bateau) { this.bateau = bateau; }

    public Tir getMonTir() { return monTir; }

    public void setMonTir(Tir monTir) { this.monTir = monTir;}


    @Override
    public String toString() {
        if(monTir != null){
            return "*";
        }
        if (bateau != null){
            return " ";
        }
        return "-";
    }



}
