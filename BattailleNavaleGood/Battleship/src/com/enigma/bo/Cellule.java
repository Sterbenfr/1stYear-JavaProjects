package com.enigma.bo;

public class Cellule {

    int x;
    int y;
    Bateau bateau;
    Tir monTir;
    Bateau bateauOrdi;

    public Bateau getBateauOrdi() {
        return bateauOrdi;
    }

    public void setBateauOrdi(Bateau bateauOrdi) {
        this.bateauOrdi = bateauOrdi;
    }

    public Bateau getBateau() {

        return bateau;
    }

    public void setBateau(Bateau bateau) {

        this.bateau = bateau;
    }

    public Tir getMonTir() {

        return monTir;
    }

    public void setMonTir(Tir monTir) {

        this.monTir = monTir;
    }

    public Cellule(int x , int y, Bateau bateau,Bateau bateauOrdi){
        this.x = x;
        this.y = y;
        this.bateau = bateau;
        this.bateauOrdi = bateauOrdi;
    }

    @Override
    public String toString() {
        if(monTir != null ){
            return"x";
        }
        if (bateau != null){
            return "1";
        }
        if (bateauOrdi != null){
            return "1";
        }
        return "0";

    }


}