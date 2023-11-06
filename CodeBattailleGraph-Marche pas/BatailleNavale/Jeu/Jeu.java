package BatailleNavale.Jeu;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static BatailleNavale.Jeu.Grille.*;
import static BatailleNavale.Jeu.Bateau.*;
public class Jeu {

    public static void Game() {

        String[] Name = {" "," "};

        Joueur Player1 = new Joueur("Player 1");
        Joueur Player2 = new Joueur("Player 2");



        Player1.setVisible(true);
        Player2.setVisible(true);

        while ((Player1.BattExist || Player1.CarrExist || Player1.SubExist || Player1.CruExist || Player1.DesExist) ||
                Player2.BattExist || Player2.CarrExist || Player2.SubExist || Player2.CruExist || Player2.DesExist){
            continue;
        }


        Random rand = new Random();
        int coin = rand.nextInt(1000)%2;
        if (coin==1){
            Player1.setPlaying();
        }else {
            Player2.setPlaying();
        }
        /*while (Player1.getScore()<700 && Player2.getScore()<700){
            Player1.setPlaying();
            Player2.setPlaying();
            if (Player1.isPlaying()){

                System.out.println(Player1.getName());
                System.out.println("Position X du tir ?");
                int posX= sc.nextInt()-1;
                System.out.println("Position Y du tir ?");
                int posY = sc.nextInt()-1;
                Shoot(Player2.getGrid(),posX,posY);
                Case[][] EnemyGrid=Player2.getGrid();
                String Dead=IsABoatDead(EnemyGrid, Player2.isDesExist(), Player2.isCruExist(), Player2.isSubExist(), Player2.isBattExist(), Player2.isCarrExist());
                switch (Dead){
                    case "destroyer" :
                        Player2.setDesExist();
                        Player1.setScore(Player1.getScore()+50);
                        break;
                    case "submarine" :
                        Player2.setSubExist();
                        Player1.setScore(Player1.getScore()+100);
                        break;
                    case "cruiser" :
                        Player2.setCruExist();
                        Player1.setScore(Player1.getScore()+100);
                        break;
                    case "battleship" :
                        Player2.setBattExist();
                        Player1.setScore(Player1.getScore()+200);
                        break;
                    case "carrier" :
                        Player2.setCarrExist();
                        Player1.setScore(Player1.getScore()+250);
                        break;
                    case "no" :
                        break;
                }
                if(Player1.getScore()==700){
                    break;
                }
            }
            if (Player2.isPlaying()){
                System.out.println(Player2.getName());
                System.out.println("Position X du tir ?");
                int posX= sc.nextInt()-1;
                System.out.println("Position Y du tir ?");
                int posY = sc.nextInt()-1;
                Shoot(Player1.getGrid(),posX,posY);
                Case[][] EnemyGrid=Player1.getGrid();
                String Dead=IsABoatDead(EnemyGrid, Player1.isDesExist(), Player1.isCruExist(), Player1.isSubExist(), Player1.isBattExist(), Player1.isCarrExist());
                switch (Dead){
                    case "destroyer" :
                        Player1.setDesExist();
                        Player2.setScore(Player2.getScore()+50);
                        break;
                    case "submarine" :
                        Player1.setSubExist();
                        Player2.setScore(Player2.getScore()+100);
                        break;
                    case "cruiser" :
                        Player1.setCruExist();
                        Player2.setScore(Player2.getScore()+100);
                        break;
                    case "battleship" :
                        Player1.setBattExist();
                        Player2.setScore(Player2.getScore()+200);
                        break;
                    case "carrier" :
                        Player1.setCarrExist();
                        Player2.setScore(Player2.getScore()+250);
                        break;
                    case "no" :
                        break;
                }
                if(Player2.getScore()==700){
                    break;
                }
            }

        }
        if (Player1.getScore()==700){
            System.out.print("Bravo ");
            System.out.print(Player1.getName());
            System.out.println(" ! Tu as gagné");
        }
        if (Player2.getScore()==700){
            System.out.print("Bravo ");
            System.out.print(Player2.getName());
            System.out.println(" ! Tu as gagné");
        }*/
    }
}