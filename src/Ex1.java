
import javax.swing.*;

public class Ex1 extends JFrame
{
    public Ex1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocation(100,100);
        setTitle("Border Layout for JFrame");
    }


    public static void main(String [] args)
    {
        Ex1 frame = new Ex1();
        frame.setVisible(true);
    }
}

