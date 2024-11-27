package EXP7;

import java.awt.*;
import java.awt.event.*;
/*<applet code="KeyListenerExample" width=300 height=300></applet>*/
public class KeyListenerExample extends Frame implements KeyListener{
    Label l;
    TextArea area;
    KeyListenerExample(){
        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(20,80,300,300);
        area.addKeyListener(this);
        add(l);
        add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);}
    public void keyPressed(KeyEvent e){
        l.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent e){
        l.setText("Key released");
    }
    public void keyTyped(KeyEvent e){
        l.setText("Key Typed");
    }
    public static void main(String[] args){
        new KeyListenerExample();
    }}
