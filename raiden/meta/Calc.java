import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/* <applet code="Calc" height=300 width=300></applet> */
public class Calc extends Applet implements ActionListener {
    TextField tf;
    double arg = 0;
    String op = "=";
    boolean start = true;

    public void init() {
        setLayout(new BorderLayout());
        tf = new TextField("0");
        tf.setEditable(false); // Prevent manual edits
        add(tf, BorderLayout.NORTH);

        Panel p = new Panel();
        p.setLayout(new GridLayout(4, 4));
        String buttons = "123/456*789-0.+=";
        for (int i = 0; i < buttons.length(); i++) {
            Button b = new Button(buttons.substring(i, i + 1));
            p.add(b);
            b.addActionListener(this);
        }
        add(p, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if ('0' <= s.charAt(0) && s.charAt(0) <= '9' || s.equals(".")) {
            if (start) {
                tf.setText(s);
            } else {
                tf.setText(tf.getText() + s);
            }
            start = false;
        } else {
            try {
                calcu(Double.parseDouble(tf.getText()));
                op = s;
                start = true;
            } catch (NumberFormatException e) {
                tf.setText("Error");
            }
        }
    }

    public void calcu(double n) {
        try {
            if (op.equals("+")) {
                arg += n;
            } else if (op.equals("-")) {
                arg -= n;
            } else if (op.equals("*")) {
                arg *= n;
            } else if (op.equals("/")) {
                if (n == 0) {
                    throw new ArithmeticException();
                }
                arg /= n;
            } else if (op.equals("=")) {
                arg = n;
            }
            tf.setText("" + arg);
        } catch (ArithmeticException e) {
            tf.setText("Error: Divide by 0");
            arg = 0;
            op = "=";
        }
    }
}
