package TEST;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class 卡片布局 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("卡片布局");


        JPanel contain = new JPanel();
        contain.setLayout(new BorderLayout());



        JPanel panelup = new JPanel();
        JPanel paneldown = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        contain.add(panelup,BorderLayout.CENTER);
        contain.add(paneldown,BorderLayout.SOUTH);

        CardLayout card = new CardLayout();
        panelup.setLayout(card);

        JButton button1 = new JButton("你好");
        button1.addActionListener(e -> card.first(panelup));

        JButton button2 =  new JButton("再见");
        button2.addActionListener(e -> card.last(panelup));

        JLabel label1 = new JLabel("hahahaha");
        JLabel label2 = new JLabel("hehehehe");

        panel1.revalidate();
        panel1.setSize(300, 380);
        panelup.setVisible(true);
        panel1.setBackground(Color.black);
        panel1.add(label1);

        panel2.revalidate();
        panel2.setSize(300, 380);
        panel2.setBackground(Color.pink);
        panelup.setVisible(true);
        panel2.add(label2);


        paneldown.add(button1);
        paneldown.add(button2);

        panelup.add(panel1);
        panelup.add(panel2);

        contain.setSize(300, 380);
        frame.add(contain);
        frame.setVisible(true);
        frame.setSize(300, 400);

    }

}