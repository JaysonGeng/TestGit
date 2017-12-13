package TEST;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Íø¸ñ²¼¾Ö {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        int size = 9;
        JButton[] jButtons = new JButton[9];
        for(int i= 0;i<size;i++) {
            jButtons[i]=new JButton("¹þà¶"+i);
        }

        frame.setLayout(new GridLayout(3,3,4,5));
        for(int k=0;k<size;k++) {
            frame.add(jButtons[k]);
        }
        jButtons[1].setBackground(Color.blue);



        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




    }

}