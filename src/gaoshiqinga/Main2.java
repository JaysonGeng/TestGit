package gaoshiqinga;

import gaoshiqinga.entity.Bag;
import gaoshiqinga.entity.Book;
import gaoshiqinga.entity.LList;
import gaoshiqinga.entity.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        Person XiaoMing = new Person();
        XiaoMing.setName("XiaoMing");


        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        JTextField bookname = new JTextField();
        bookname.setFont(new Font("微软雅黑", Font.BOLD, 20));
        JTextField bookauthor = new JTextField();
        bookname.setFont(new Font("微软雅黑", Font.BOLD, 20));
        bookauthor.setFont(new Font("微软雅黑", Font.BOLD, 20));
        Font font = new Font("微软雅黑", Font.BOLD, 30);

        JLabel title = new JLabel("买书2333");

        JLabel user = new JLabel("书名:");
        user.setFont(font);

        JLabel password = new JLabel("作者:");
        password.setFont(font);


        JButton login = new JButton("购买");
        JButton list = new JButton("查看已购买的书");
        list.setBackground(Color.decode("#00BFFF"));
        login.setBackground(Color.decode("#00BFFF"));
        list.setFont(new Font("微软雅黑", Font.BOLD, 25));
        login.setFont(new Font("微软雅黑", Font.BOLD, 25));

        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);

        title.setFont(new Font("微软雅黑", Font.BOLD, 80));
        title.setForeground(Color.white);
        title.setBounds(130, 70, 500, 100);

        jPanel.setBackground(Color.decode("#8DEEEE"));
        jPanel.setLayout(null);
        jPanel.setSize(500, 300);
        jPanel.add(user);
        jPanel.add(password);
        jPanel.add(bookname);
        jPanel.add(bookauthor);
        jPanel.add(login);
        jPanel.add(list);

        user.setBounds(80, 30, 100, 60);
        password.setBounds(80, 80, 100, 60);
        bookname.setBounds(180, 45, 180, 35);
        bookauthor.setBounds(180, 95, 180, 35);
        login.setBounds(280, 160, 190, 40);
        list.setBounds(20, 160, 220, 40);
        jFrame.add(jPanel);
        jFrame.setTitle("小明买书系统");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Book bb = new Book();
                bb.setName(bookname.getText());
                bb.setAuthor(bookauthor.getText());
                XiaoMing.bag.addBook(bb);
            }
        });
        list.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LList ll = new LList(XiaoMing);
                bookauthor.setText("");
                bookname.setText("");
            }
        });

    }
}
