package EXP13;

import javax.swing.*;
public class JTPane {
    JFrame frame;
    public JTPane() {
        frame = new JFrame();
        JTextArea ta = new JTextArea(20 ,20);
        JTextArea tb = new JTextArea(20 ,20);
        JTextArea tc = new JTextArea(20 ,20);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        p1.add(ta);
        p2.add(tb);
        p3.add(tc);

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 300);
        tp.add("Main", p1);
        tp.add("Menu", p2);
        tp.add("Help", p3);

        frame.add(tp);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTPane();
    }
}
