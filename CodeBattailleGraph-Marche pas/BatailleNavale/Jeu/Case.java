package BatailleNavale.Jeu;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Case extends JToggleButton {
    private String Etat;

    private String appartenance;

    public Case() {
        this.Etat = "water";
        this.appartenance="Mer";
    }

    public String toString() {
        if (Objects.equals(Etat, "water")) {
            return "|   ";
        }
        if (Objects.equals(Etat, "Bateau")) {
            return "| B ";
        }
        if (Objects.equals(Etat, "TirMort")) {
            return "| ° ";
        }
        if (Objects.equals(Etat, "SunkenShip")) {
            return "| * ";
        } else {
            return "| ! ";
        }
    }

    public void setEtat(String etat) {
        this.Etat = etat;
        // Changer la couleur de fond en fonction de l'état
        switch (etat) {
            case "water":
                setBackground(Color.CYAN);
                break;
            case "Bateau":
                setBackground(Color.GRAY);
                break;
            case "TirMort":
                setBackground(Color.RED);
                break;
            case "SunkenShip":
                setBackground(Color.BLACK);
                break;
            default:
                setBackground(Color.WHITE);
                break;
        }
    }

    public String getEtat() {
        return Etat;
    }


    public void setAppartenance(String appartenance1){
        appartenance=appartenance1;
    }
    public String getAppartenance(){
        return appartenance;
    }

}