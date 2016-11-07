package hoofdstuk_12;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {
    double salaris[];
    double wt;

    public void init() {
        salaris = new double [10];

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 10 * teller + 10;

            wt += salaris[teller] ;
        }
        wt = wt / salaris.length;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 50, 20 * teller + 20);
            g.drawString("" + wt ,100,100);
        }
    }
}