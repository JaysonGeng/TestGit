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
//        //�½�һ���߽粼��
//        BorderLayout b = new BorderLayout();
//        //���õ������
//        jPanel.setLayout(b);
//        JButton jB1 = new JButton("�в�");
//        JButton jB2 = new JButton("����");
//        JButton jB3 = new JButton("�ϲ�");
//        JButton jB4 = new JButton("����");
//        JButton jB5 = new JButton("����");
//
//        //JPanel panel = new JPanel();
//        //frame.add(panel);
//        //��Ϊ�ӵ������
//        jPanel.add(jB1, b.CENTER);
//        jPanel.add(jB2, b.NORTH);
//        jPanel.add(jB3, b.SOUTH);
//        jPanel.add(jB4, b.EAST);
//        jPanel.add(jB5, b.WEST);
//
////�����봰��
//        frame.add(jPanel);
//
//        frame.setLayout(null);
//        jPanel.setSize(500, 500);
//        frame.setSize(800, 800);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//        //�ҷ���һ�����⣬�߽粼��ֻ�����ڴ��壬������������塣�����������ñ߽粼�֣���Ч��
//    }
//}

//
        JFrame frame1 = new JFrame("������");

        JButton jB6 = new JButton("�в�");
        JButton jB7 = new JButton("����");
        JButton jB8 = new JButton("�ϲ�");
        JButton jB9 = new JButton("����");
        JButton jB10 = new JButton("����");

        frame1.add(jB6);
        frame1.add(jB7);
        frame1.add(jB8);
        frame1.add(jB9);
        frame1.add(jB10);

        frame1.setLayout(new FlowLayout(FlowLayout.LEADING));
        frame1.setResizable(false);//��Ҫ�ı��С

        frame1.setSize(300,200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);
        //leading �� trailing ��right left ��ɶ����???


    }

}
