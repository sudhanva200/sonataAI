package EXP10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/*<applet code="traffic" width=400 height=400></applet>*/
public class traffic extends Applet implements ItemListener {
    int colorNum;
    CheckboxGroup cbg;
    Checkbox red, yellow, green;
    String msg = " ";

    public void init() {
        cbg = new CheckboxGroup();
        red = new Checkbox("RED", cbg, true);
        yellow = new Checkbox("YELLOW", cbg, false);
        green = new Checkbox("GREEN", cbg, false);

        add(red);
        add(yellow);
        add(green);

        red.addItemListener(this);
        yellow.addItemListener(this);
        green.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == red) {
            colorNum = 1;
        } else if (e.getSource() == yellow) {
            colorNum = 2;
        } else {
            colorNum = 3;
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillOval(150, 70, 50, 50);
        g.fillOval(150, 150, 50, 50);
        g.fillOval(150, 230, 50, 50);

        switch(colorNum) {
            case 1:
                g.setColor(Color.RED);
                g.fillOval(150, 70, 50, 50);
                msg = "STOP";
                g.drawString(msg, 150, 70);
                break;

            case 2:
                g.setColor(Color.YELLOW);
                g.fillOval(150, 150, 50, 50);
                msg = "READY";
                g.drawString(msg, 150, 150);
                break;

            case 3:
                g.setColor(Color.GREEN);
                g.fillOval(150, 230, 50, 50);
                msg = "GO";
                g.drawString(msg, 150, 230);
                break;
        }
    }
}
