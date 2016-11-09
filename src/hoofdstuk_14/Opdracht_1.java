package hoofdstuk_14;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_1 extends Applet {

    double r, r2;
    int worp, worp2;
    String[] nummers = {"een", "twee", "drie", "fier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
    String[] naam = {"ruiten", "harten", "klaveren", "schoppen"};

    public void init() {
        r = Math.random();
        worp = (int) (r * 4);
        r2 = Math.random();
        worp2 = (int) (r2 * 14);
    }

    public void paint(Graphics g) {
        g.drawString(naam[worp], 50, 60);
        g.drawString(nummers[worp2], 120, 60);
    }
}