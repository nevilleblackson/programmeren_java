package hoofdstuk_12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_5 extends Applet {


    private boolean gevonden ,geklikt;
    private int[] salaris = {100, 300, 500, 700, 900};

    private TextField Text;
    private int INDEX = 1;
    public void init() {


        Text = new TextField("", 20);
        Button ok = new Button("ok");

        ok.addActionListener(new TextListener());
        Text.addActionListener(new TextListener());

        add(Text);
        add(ok);
    }


    public void paint(Graphics g) {

        if (geklikt) {
            if (gevonden) {
                g.drawString("De waarde is gevonden. index nr" + INDEX, 100, 100);
            } else {
                g.drawString("De waarde is niet gevonden.", 20, 50);
            }
        }
    }

    private class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = Text.getText();
            int Textin = Integer.parseInt(s);

            geklikt = false;
            gevonden = false;

            int teller = 0;

                while (teller < salaris.length) {
                    if (salaris[teller] == Textin) {
                        gevonden = true;
                        INDEX = teller;
                    }
                    teller++;
                }
            geklikt = true;
            repaint();
        }
    }
}