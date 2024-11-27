package EXP9;


import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*<applet code="division" width=400 height=400></applet>*/
public class division extends Applet implements ActionListener {
    Button b1, b2;
    Label l1, l2, l3;
    TextField tf1, tf2, tf3;
    String msg;


    public void init() {
        b1 = new Button("Compute");
        b1.addActionListener(this);

        b2 = new Button("Clear");
        b2.addActionListener(this);

        tf1 = new TextField(20);
        tf2 = new TextField(20);
        tf3 = new TextField(20);

        l1 = new Label("1st Number");
        l2 = new Label("2nd Number");
        l3 = new Label("Result");

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(l3);
        add(tf3);

        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                int a = Integer.parseInt(tf1.getText());
                int b = Integer.parseInt(tf2.getText());
                int c = a / b;
                tf3.setText(" " + c);
                repaint();
            } catch (NumberFormatException ex) {
                tf3.setText(" ");
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Only Numbers!");
                repaint();
            } catch (ArithmeticException ex) {
                tf3.setText(" ");
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Value shouldn't be 0");
                repaint();
            }
        } else {
            tf1.setText(" ");
            tf2.setText(" ");
            tf3.setText(" ");
            msg = " ";
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 30, 70);
    }
}
