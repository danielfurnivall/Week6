
import javax.swing.*;
import java.awt.*;

public class Ex2 extends JFrame
{
    private JLabel northLabel, southLabel, eastLabel, westLabel, centerLabel;
    private JPanel topPanel, bottomPanel, rightPanel, leftPanel, centerPanel;
    public Ex2() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Border Layout for JFrame");
        topPanel = new JPanel();
        rightPanel = new JPanel();
        leftPanel = new JPanel();
        bottomPanel = new JPanel();
        centerPanel = new JPanel();

        northLabel = new JLabel("North");
        southLabel = new JLabel("South");
        eastLabel = new JLabel("East");
        westLabel = new JLabel("West");
        centerLabel = new JLabel("Centre");
        this.setLayout(new BorderLayout());
        this.add(topPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);
        topPanel.add(northLabel, BorderLayout.CENTER);
        bottomPanel.add(southLabel, BorderLayout.CENTER);
        leftPanel.add(westLabel, BorderLayout.CENTER);
        rightPanel.add(eastLabel, BorderLayout.CENTER);
        centerPanel.add(centerLabel, BorderLayout.CENTER);

    }




    public static void main(String [] args)
    {
        Ex3 frame = new Ex3();

        frame.setVisible(true);
    }


}
