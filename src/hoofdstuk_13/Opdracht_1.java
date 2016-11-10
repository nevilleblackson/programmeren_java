package hoofdstuk_13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht_1 extends Applet {

    Button b, c, d, g, f;
    Button[] a;
    Color kl;
    String n;
    boolean geklikt = false;


    public void init() {

        a = new Button[5];
        b = new Button("CYAN");
        c = new Button("rood");
        d = new Button("geel");
        g = new Button("groen");
        f = new Button("wit");

        b.addActionListener(new bListener());
        c.addActionListener(new cListener());
        d.addActionListener(new dListener());
        g.addActionListener(new eListener());
        f.addActionListener(new fListener());

        add(b);
        add(c);
        add(d);
        add(g);
        add(f);

    }

    public void paint(Graphics g) {

        if (geklikt) {
            achtergrondkluer(g, kl, n);
        }
    }

    void achtergrondkluer(Graphics g, Color kleur, String name) {

        setBackground(kleur);
        g.drawString(name, 100, 100);

    }

    private class bListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kl = Color.CYAN;
            n = b.getLabel();

            geklikt = true;
            repaint();
        }
    }

    private class cListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kl = Color.red;
            n = c.getLabel();

            geklikt = true;
            repaint();
        }
    }

    private class dListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kl = Color.yellow;
            n = d.getLabel();

            geklikt = true;
            repaint();
        }
    }

    private class eListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kl = Color.green;
            n = g.getLabel();

            geklikt = true;
            repaint();
        }
    }

    private class fListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            kl = Color.white;
            n = f.getLabel();

            geklikt = true;
            repaint();
        }
    }
}