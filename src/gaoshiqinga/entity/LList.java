package gaoshiqinga.entity;

import javax.swing.*;

public class LList {

    public LList(Person XM){
        JFrame jFrame =new JFrame("已购买的书");
        JPanel jPanel =new JPanel();

        JTextArea jTextArea =new JTextArea();
        JScrollPane jScrollPane =new JScrollPane(jTextArea);
        jTextArea.setSize(300,500);
        jPanel.add(jScrollPane);
        jPanel.setSize(300,500);
        jFrame.setSize(300,500);
        jTextArea.setText(XM.bag.getBookList());
        jFrame.add(jPanel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}
