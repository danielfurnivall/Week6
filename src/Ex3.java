
import javax.swing.*;
import java.awt.*;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.border.Border;


public class Ex3 extends JFrame
{
    private JLabel northLabel, southLabel, eastLabel, westLabel, centerLabel;
    private JPanel topPanel, bottomPanel, rightPanel, leftPanel, centerPanel;
    public Ex3() {
        Border blackline = BorderFactory.createLineBorder(Color.BLACK);
        Font f = new Font("Helvetica", Font.PLAIN, 24);
        Font g = new Font("Comic Sans MS", Font.BOLD, 30);

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
        centerLabel = new JLabel("<html><img src='https://www.gla.ac.uk/media/Media_535060_smxx.jpg' width='100' height='100'/></html>");

        westLabel.setFont(f);
        eastLabel.setFont(f);
        southLabel.setFont(f);
        northLabel.setFont(f);
        centerLabel.setFont(g);

        leftPanel.setLayout(new GridBagLayout());
        centerPanel.setLayout(new GridBagLayout());
        rightPanel.setLayout(new GridBagLayout());
        this.setLayout(new BorderLayout());

        leftPanel.setBorder(blackline);
        rightPanel.setBorder(blackline);
        topPanel.setBorder(blackline);
        bottomPanel.setBorder(blackline);

        this.add(topPanel, BorderLayout.NORTH);
        this.add(centerPanel, BorderLayout.CENTER);
        this.add(bottomPanel, BorderLayout.SOUTH);
        this.add(rightPanel, BorderLayout.EAST);
        this.add(leftPanel, BorderLayout.WEST);

        topPanel.add(northLabel);
        bottomPanel.add(southLabel);
        leftPanel.add(westLabel);
        rightPanel.add(eastLabel);
        centerPanel.add(centerLabel);

    }




    public static void main(String [] args)
    {
        Ex3 frame = new Ex3();

        frame.setVisible(true);
    }


}
