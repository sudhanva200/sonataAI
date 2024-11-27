package EXP11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calci extends Applet implements ActionListener {
    TextField tf;
    double arg = 0;
    String op = " = ";
    boolean start = true;

    public void init() {
        setLayout(new BorderLayout());
        tf = new TextField(0);
        add(tf, BorderLayout.CENTER);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));
        String buttons = "123/456*7890.+-E";

        for (int i = 0; i < buttons.length(); i++) {
            Button b = new Button(buttons.substring(i, i + 1));
            p.add(b);
            b.addActionListener(this);
        }
        add(p, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ('0' <= s.charAt(0) && s.charAt(0) <= '9') {
            if (start) {
                tf.setText(s);
                start = false;
            } else {
                tf.setText(tf.getText() + s);
            }
        } else if (s.equals("E")) {
            tf.setText("");
            arg = 0;
            op = "=";
            start = true;
        } else {
            if (!op.equals("=")) {
                Calci(Double.parseDouble(tf.getText()));
            } else {
                arg = Double.parseDouble(tf.getText());
            }
            op = s;
            start = true;
        }
    }

    public void Calci(Double n) {
        if (op.equals("+")) {
            arg = arg + n;
        } else if (op.equals("-")) {
            arg = arg - n;
        } else if (op.equals("*")) {
            arg = arg * n;
        } else if (op.equals("/")) {
            if (n != 0) {
                arg = arg / n;
            } else {
                tf.setText("Error");
                return;
            }
        } else if (op.equals("=")) {
            arg = n;
        }
        tf.setText(arg + "");
    }
}
