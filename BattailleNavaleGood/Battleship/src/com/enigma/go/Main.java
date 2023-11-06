package com.enigma.go;


import com.enigma.bo.Bateau;
import com.enigma.bo.Carte;
import com.enigma.bo.Exception;
import com.enigma.bo.Game;
import com.enigma.gui.MyWindow;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MyWindow  window = new MyWindow();
            }
        });

    }
}
