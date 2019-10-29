
import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame
{
    private JLabel northLabel, southLabel, eastLabel, westLabel;

    public Ex1() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Border Layout for JFrame");
        northLabel = new JLabel("North");
        southLabel = new JLabel("South");
        eastLabel = new JLabel("East");
        westLabel = new JLabel("West");
        this.setLayout(new BorderLayout());
        this.add(northLabel, BorderLayout.NORTH);
        this.add(southLabel, BorderLayout.SOUTH);
        this.add(eastLabel, BorderLayout.EAST);
        this.add(westLabel, BorderLayout.WEST);
    }




    public static void main(String [] args)
    {
        Ex3 frame = new Ex3();

        frame.setVisible(true);
    }


}

