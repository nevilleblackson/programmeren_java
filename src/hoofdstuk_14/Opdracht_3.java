package hoofdstuk_14;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_3 extends Applet {

    double r, r2;
    int worp, worp2;
    String[] nummers = {"een", "twee", "drie", "fier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
    String[] naam = {"ruiten", "harten", "klaveren", "schoppen"};
    String[] p1, p2, p3, p4;
    String[] kaart;

    public void init() {
        p1 = new String[13];
        p2 = new String[13];
        p3 = new String[13];
        p4 = new String[13];

        kaart = new String[56];
    }

    public void paint(Graphics g) {

        for (int i = 0; i < p1.length; i++) {

            r = Math.random();
            worp = (int) (r * 4);
            r2 = Math.random();
            worp2 = (int) (r2 * 14);
            p1[i] = naam[worp] + "    " + nummers[worp2];
            g.drawString(p1[i], 100, 50 * i + 20);

            r = Math.random();
            worp = (int) (r * 4);
            r2 = Math.random();
            worp2 = (int) (r2 * 14);
            p2[i] = naam[worp] + "    " + nummers[worp2];
            g.drawString(p2[i], 300, 50 * i + 20);

            r = Math.random();
            worp = (int) (r * 4);
            r2 = Math.random();
            worp2 = (int) (r2 * 14);
            p3[i] = naam[worp] + "    " + nummers[worp2];
            g.drawString(p3[i], 500, 50 * i + 20);

            r = Math.random();
            worp = (int) (r * 4);
            r2 = Math.random();
            worp2 = (int) (r2 * 14);
            p4[i] = naam[worp] + "    " + nummers[worp2];
            g.drawString(p4[i], 700, 50 * i + 20);
        }
    }
}