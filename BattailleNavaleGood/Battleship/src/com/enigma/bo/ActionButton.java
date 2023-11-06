package com.enigma.bo;

import com.enigma.gui.MyWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButton implements ActionListener  {

    private int coord;
    private int y;
    public  Game jeu;
    public  MyWindow window;

    public ActionButton(int x,int y, Game jeu, MyWindow window) {
        this.coord = x;
        this.y = y;
        this.jeu = jeu;
        this.window = window ;

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 100; i++) {
            if (i == coord) {
                try {
                    jeu.getEntreeUtilisateur(coord,y, window);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        /*
        for (int i = 0; i < 5; i++) {

            try {
                jeu.getEntreeUtilisateur(coord,window);
            } catch (Exception ex) {
                //i--;
                //System.out.println("erreur utilisateur ");
            }

        }*/
    }
}
