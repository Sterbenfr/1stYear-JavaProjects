package com.enigma.gui;

        import com.enigma.bo.ActionButton;
        import com.enigma.bo.Game;

        import javax.swing.*;
        import java.awt.*;

public class MyWindow extends JFrame {

    Game jeu = new Game();
    private int x;
    private int y;
    private int index;
/*
    private JRadioButton horizontal;
    private JRadioButton vertical;
    private JPanel panelTop;
*/
    private JButton[] mesButtons = new JButton[110];


    public MyWindow() {
        jeu.launch();
        this.setVisible(true);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Battleship");
        JPanel panel = new JPanel();
        /* panel.add(panelTop = new JPanel(), BorderLayout.WEST);
        //panel.add(horizontal = new JRadioButton("Horizontal", true));
        //panel.add(vertical = new JRadioButton("Vertical", true));

         */
        panel.setLayout(new FlowLayout());
        //JRadioButton HV = new JRadioButton("Horizontale", true);
        this.setContentPane(panel);
        setLayout(new GridLayout(11, 10));
        this.setContentPane(panel);
        panel.add(new Button(""));
        int j = 0;
        int k = 0;


        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("" + j);
            panel.add(button);
            j++;

        }
        for (int i = 0; i < 10; i++) {
            JButton button = new JButton("" + k);
            panel.add(button);
            k++;
            for (int p = 0; p < 10; p++) {
                JButton button2 = new JButton("");
                mesButtons[index] = button2;
                button2.addActionListener(new ActionButton(index,y, jeu, this));
                panel.add(button2);
                index++;
            }
        }

/*
        int compteurBateau = 0;

        while (compteurBateau < 5) {

            while(!mygame.getEntreeOrdi(compteurBateau)) {
                System.out.println("Ca ne fonctionne pas, recommence ");
            }
            compteurBateau++;
        }
 */
/*
        for(int i = 0; i<100;i++){
            mygame.shoot();
        }
*/
    }


    public void buttonColor(int x, int y) {

        x = x * 10;
        y = x + y;

        mesButtons[y].setOpaque(true);
        mesButtons[y].setBackground(Color.BLACK);
        mesButtons[y].setBorderPainted(false);
    }

}