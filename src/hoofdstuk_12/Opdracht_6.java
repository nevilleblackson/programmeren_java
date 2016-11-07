package hoofdstuk_12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_6 extends Applet {


    private boolean gevonden;
    private int[] getal = {100, 300, 500, 700, 900,500,900,600,500,100,500,1700,9000,22,22};

    private TextField Text;
    private int hoeveelheid;
    public void init() {


        Text = new TextField("", 15);
        Button ok = new Button("ok");

        ok.addActionListener(new TextListener());
        Text.addActionListener(new TextListener());

        add(Text);
        add(ok);
    }


    public void paint(Graphics g) {

        if (gevonden) {
            g.drawString("De waarde is gevonden. X" + hoeveelheid + "voor", 100, 100);
        } else {
            g.drawString("het komt niet voor", 20, 50);
        }
    }

    private class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = Text.getText();
            int Textin = Integer.parseInt(s);

            gevonden = false;

            int teller = 0;
            hoeveelheid = 0;
            while (teller < getal.length) {
                if (getal[teller] == Textin) {
                    gevonden = true;
                }
                if (getal[teller] == Textin){
                    hoeveelheid +=1;
                }
                teller++;
            }
            repaint();
        }
    }
}