package EXP8;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*<applet code="factorial" width=400 height=400></applet>*/
public class factorial extends Applet implements ActionListener {
    Button b1, b2;
    TextField tf1, tf2;
    Label l1, l2;

    public void init() {
        b1 = new Button("Compute");
        b1.addActionListener(this);
        b2 = new Button("Clear");
        b2.addActionListener(this);

        tf1 = new TextField(20);
        tf2 = new TextField(20);

        l1 = new Label("Factorial of ");
        l2 = new Label("Result");

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int a = Integer.parseInt(tf1.getText());
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact *= i;
            }
            tf2.setText(String.valueOf(fact));
        } else {
            tf1.setText("");
            tf2.setText("");
        }
    }
}
