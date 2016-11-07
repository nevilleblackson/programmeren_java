package Toets;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Toets_Java1 extends Applet {

    private TextField Text;
    private int TijdnewYork;
    private int Tijdtokyo;
    private int Tijdsuriname;
    private int Tijdrusland;
    private boolean Textfalid = false;
    private boolean Textfalse = false;


    public void init() {

        Text = new TextField("",10);
        Label name = new Label("voer een uur in");
        Button toontijded = new Button("Toon tijden");

        Text.addActionListener(new TextListener());
        toontijded.addActionListener( new TextListener());

        add(name);
        add(Text);
        add(toontijded);
    }

    public void paint(Graphics g) {

        if (Textfalid) {
            int x = 100;
            int y = 100;
            g.drawString("tijd in NewYork  " + TijdnewYork + ":00 uur", x, y);
            g.drawString("tijd in Tokyo  " + Tijdtokyo + ":00 uur", x, y + 50);
            g.drawString("tijd in Suriname  " + Tijdsuriname + ":00 uur", x, y + 100);
            g.drawString("tijd in Rusland  " + Tijdrusland + ":00 uur", x, y + 150);
        }
        if (Textfalse ) {
            g.drawString("Invoer maximaal 23 minimaal 0", 100, 100);
        }
    }

    private class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String I = Text.getText();
            int textIn = Integer.parseInt(I);

            TijdnewYork = textIn - 6;
            if (TijdnewYork < 0) {
                TijdnewYork += 24;
            }

            Tijdtokyo = textIn + 7;
            if (Tijdtokyo > 23) {
                Tijdtokyo -= 24;
            }

            Tijdsuriname = textIn - 5;
            if (Tijdsuriname < 0) {
                Tijdsuriname += 24;
            }

            Tijdrusland = textIn + 1;
            if (Tijdrusland  > 23) {
                Tijdrusland -= 24;
            }

            Textfalid = textIn > -1 && textIn < 24;
            Textfalse = textIn < 0 || textIn > 23;
            repaint();
        }
    }
}