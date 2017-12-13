package TEST;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class FlowLayoutDemo extends JFrame {

    FlowLayout contentPanelLayout = new FlowLayout();
    Map<String, Integer> alignmentMap = new HashMap<String, Integer>();
    JPanel configPanel = new JPanel();
    JPanel contentPanel = new JPanel();
    JComboBox<String> alignmentComboBox = new JComboBox<String> ();
    JTextField textHgap = new JTextField("10");
    JTextField textVgap = new JTextField("20");
    MyListener myListener = new MyListener();

    public FlowLayoutDemo() {
        //init
        alignmentMap.put("LEFT", 0);
        alignmentMap.put("CENTER", 1);
        alignmentMap.put("RIGHT", 2);
        alignmentMap.put("LEADING", 3);
        alignmentMap.put("TRAILING", 4);


        //�������
        configPanel.setLayout(new FlowLayout());
        configPanel.add(new JLabel("���뷽ʽ"));

        for (String alignment : alignmentMap.keySet()) {
            alignmentComboBox.addItem(alignment);
        }

        configPanel.add(alignmentComboBox);
        configPanel.add(new JLabel("ˮƽ���"));

        configPanel.add(textHgap);
        configPanel.add(new JLabel("��ֱ���"));

        configPanel.add(textVgap);

        JButton actionBtn = new JButton("Action!!!");
        actionBtn.addActionListener(myListener);
        configPanel.add(actionBtn);

        //չʾ���

        contentPanel.setLayout(contentPanelLayout);
        contentPanel.add(new JButton("Button 1"));
        contentPanel.add(new JButton("Button 2"));
        contentPanel.add(new JButton("Button 3"));
        contentPanel.add(new JButton("Button 4"));

        //������
        setLayout(new BorderLayout());
        add("North",configPanel);
        add("South", contentPanel);
    }

    class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String alignmentStr = alignmentComboBox.getSelectedItem().toString();
            int alignment = alignmentMap.get(alignmentStr);
            contentPanelLayout.setAlignment(alignment);
            int hgap = Integer.valueOf(textHgap.getText());
            int vgap = Integer.valueOf(textVgap.getText());
            contentPanelLayout.setHgap(hgap);
            contentPanelLayout.setVgap(vgap);

            contentPanel.updateUI();
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlowLayoutDemo window = new FlowLayoutDemo();
        window.setTitle("FlowLayoutDemo");
        // �ô������ݷ��õ�����趨���ڵĴ�Сʹ֮��������������õ��������

        window.setPreferredSize(new Dimension(500, 200));
        window.pack();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null); // �ô��������ʾ
    }
}