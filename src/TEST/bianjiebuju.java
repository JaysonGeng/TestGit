package TEST;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class bianjiebuju {

    public static void main(String[] args) {
//        JFrame frame = new JFrame();
//        frame.setTitle("bianjie");
//
//        JPanel jPanel = new JPanel();
//        //新建一个边界布局
//        BorderLayout b = new BorderLayout();
//        //设置到面板上
//        jPanel.setLayout(b);
//        JButton jB1 = new JButton("中部");
//        JButton jB2 = new JButton("北部");
//        JButton jB3 = new JButton("南部");
//        JButton jB4 = new JButton("东部");
//        JButton jB5 = new JButton("西部");
//
//        //JPanel panel = new JPanel();
//        //frame.add(panel);
//        //改为加到面板上
//        jPanel.add(jB1, b.CENTER);
//        jPanel.add(jB2, b.NORTH);
//        jPanel.add(jB3, b.SOUTH);
//        jPanel.add(jB4, b.EAST);
//        jPanel.add(jB5, b.WEST);
//
////面板加入窗体
//        frame.add(jPanel);
//
//        frame.setLayout(null);
//        jPanel.setSize(500, 500);
//        frame.setSize(800, 800);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//        //我发现一个问题，边界布局只适用于窗体，并不能用于面板。如果是面板上用边界布局，无效。
//    }
//}

//
        JFrame frame1 = new JFrame("流布局");

        JButton jB6 = new JButton("中部");
        JButton jB7 = new JButton("北部");
        JButton jB8 = new JButton("南部");
        JButton jB9 = new JButton("东部");
        JButton jB10 = new JButton("西部");

        frame1.add(jB6);
        frame1.add(jB7);
        frame1.add(jB8);
        frame1.add(jB9);
        frame1.add(jB10);

        frame1.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame1.setResizable(false);//不要改变大小

        frame1.setSize(300,200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        //leading 和 trailing 和right left 有啥区别???


    }

}
