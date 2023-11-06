import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class TestJFrame6 /*implements ActionListener*/ {


    public static void main(String argv[]) {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame f = new JFrame("Battleship");
        f.setSize(dim.width,dim.height);
        JButton b =new JButton("Shoot");
        f.getContentPane().add(b);

        JToggleButton H = new JToggleButton("Horrizontal");
        JToggleButton V =new JToggleButton("Vertical");
        JToggleButton sub =new JToggleButton("submarine");
        JToggleButton des =new JToggleButton("destroyer");
        JToggleButton battleship =new JToggleButton("battleship");
        JToggleButton carrier =new JToggleButton("carrier");
        JToggleButton cruiser =new JToggleButton("cruiser");

        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);

        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        };

        f.addWindowListener(l);

        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


        f.setLocation(dim.width/2 - f.getWidth()/2, dim.height/2 - f.getHeight()/2);

        ButtonGroup groupe = new ButtonGroup();

        groupe.add(H);
        groupe.add(V);

        ButtonGroup Boat=new ButtonGroup();

        Boat.add(carrier);
        Boat.add(cruiser);
        Boat.add(battleship);
        Boat.add(sub);
        Boat.add(des);

        menuBar.add(b);
        menuBar.add(H);
        menuBar.add(V);
        menuBar.add(des);
        menuBar.add(cruiser);
        menuBar.add(sub);
        menuBar.add(battleship);
        menuBar.add(carrier);

        JPanel pan = new JPanel (new GridLayout (10,10,1,1));
        Border blackline = BorderFactory.createLineBorder(Color.black,1);
        ButtonGroup Grid=new ButtonGroup();
        for(int i = 0; i<100;i++){
            JToggleButton ptest = new JToggleButton();
            ptest.setBorder(blackline);
            Grid.add(ptest);
            ptest.setBackground(Color.cyan);
            ptest.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(((JToggleButton) e.getSource()).isSelected()) {
                        ((JToggleButton) e.getSource()).setForeground(Color.BLACK);
                        ((JToggleButton) e.getSource()).setBackground(new Color(255, 251, 0));
                    } else {
                        ((JToggleButton) e.getSource()).setBackground(new Color(255, 252, 92));
                        ((JToggleButton) e.getSource()).setForeground(Color.GRAY);
                    }
                }
            });
            pan.add(ptest);

        }



        f.add(pan);
        f.setVisible(true);
    }

}
