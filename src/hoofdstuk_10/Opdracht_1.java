package hoofdstuk_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_1 extends Applet {

    Button volgorde, reset;
    TextField text;
    Label name;
    double Invoer, hoog, laag, recent;
    String s;
    double Getal;

    public void init() {

        text = new TextField("", 15);
        name = new Label("type een cijfer ");
        volgorde = new Button("ok");
        text.addActionListener(new TextListener());
        volgorde.addActionListener(new TextListener());

        add(name);
        add(text);
        add(volgorde);

    }

    public void paint(Graphics g) {

        g.drawString("hoogste :" + hoog, 100, 100);
        g.drawString("recent :" + recent, 300, 100);

    }


    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = text.getText();
            Getal = Double.parseDouble(s);

            if (Getal > hoog) {
                hoog = Getal;
            }


            recent = Getal;


            repaint();
        }

    }

}
