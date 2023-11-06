package BatailleNavale.Jeu;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import BatailleNavale.Jeu.Grille.*;
import BatailleNavale.Jeu.Bateau;
import BatailleNavale.Jeu.Case;

public class Joueur  extends JFrame implements ActionListener {

    private JButton shoot;
    private JToggleButton H;
    private JToggleButton V;
    private JToggleButton sub;
    private JToggleButton des;
    private JToggleButton battles;
    private JToggleButton carrier;
    private JToggleButton cruiser;

    private JButton place;
    private String name;
    private boolean isPlaying= false;
    private int score;
    boolean DesExist;
    boolean CruExist;
    boolean SubExist;
    boolean BattExist;
    boolean CarrExist;


    public boolean isDesExist() {
        return DesExist;
    }

    public void setDesExist() {
        DesExist = false;
    }

    public boolean isCruExist() {
        return CruExist;
    }

    public void setCruExist() {
        CruExist = false;
    }

    public boolean isSubExist() {
        return SubExist;
    }

    public void setSubExist() {
        SubExist = false;
    }

    public boolean isBattExist() {
        return BattExist;
    }

    public void setBattExist() {
        BattExist = false;
    }

    public boolean isCarrExist() {
        return CarrExist;
    }

    public void setCarrExist() {
        CarrExist = false;
    }

    public Grille GrillePlayer;

    int destroyerCount=1;
    int cruiserCount=1;
    int submarineCount=1;
    int battleshipCount=1;
    int carrierCount=1;
    public Joueur(String title) {
        super(title);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        isPlaying = false;
        score = 0;
        GrillePlayer= new Grille();
        add(GrillePlayer);
        DesExist=true;
        CruExist=true;
        SubExist=true;
        BattExist=true;
        CarrExist=true;
        setSize(dim.width/2,dim.height);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JButton shoot =new JButton("Shoot");
        JToggleButton H = new JToggleButton("Horrizontal");
        JToggleButton V =new JToggleButton("Vertical");
        JToggleButton sub =new JToggleButton("submarine");
        JToggleButton des =new JToggleButton("destroyer");
        JToggleButton battleship =new JToggleButton("battleship");
        JToggleButton carrier =new JToggleButton("carrier");
        JToggleButton cruiser =new JToggleButton("cruiser");
        JButton place = new JButton("Place");

        ButtonGroup groupe = new ButtonGroup();
        groupe.add(H);
        groupe.add(V);
        ButtonGroup Boat=new ButtonGroup();
        Boat.add(carrier);
        Boat.add(cruiser);
        Boat.add(battleship);
        Boat.add(sub);
        Boat.add(des);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(shoot);
        menuBar.add(H);
        menuBar.add(V);
        menuBar.add(des);
        menuBar.add(cruiser);
        menuBar.add(sub);
        menuBar.add(battleship);
        menuBar.add(carrier);
        menuBar.add(place);

        shoot.addActionListener(this);
        H.addActionListener(this);
        V.addActionListener(this);
        des.addActionListener(this);
        cruiser.addActionListener(this);
        sub.addActionListener(this);
        battleship.addActionListener(this);
        carrier.addActionListener(this);



        setJMenuBar(menuBar);
        setLocation(dim.width/2 - getWidth()/2, dim.height/2 - getHeight()/2);
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(){
        isPlaying = !isPlaying;
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

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == place) {
            if (H.isSelected() ){
                if (carrier.isSelected()){
                    if (carrierCount==1){
                        for (int x=0;x<10;x++){
                            for (int y=0;y<10;y++){
                                if (GrillePlayer.isItSelected(x,y)){
                                    GrillePlayer.addBoat(x,y,name,setSizeFromName(name),"H",destroyerCount,submarineCount,cruiserCount,battleshipCount,carrierCount);

                                }

                            }

                        }
                    }
                }else if (des.isSelected()){

                } else if (sub.isSelected()) {

                } else if (battles.isSelected()) {

                } else if (cruiser.isSelected()) {

                }
            }
        }
    }
    public int getScore() {
        return score;
    }

    public int setScore(int newscore){
        score=newscore;
        return 1;
    }

    public void setName(String newname){
        name= newname;
    }
    public String getName() {
        return name;
    }


}