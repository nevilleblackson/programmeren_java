package hoofdstuk_6;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {
   double x,uitkomst;

    public void init() {
    x = 113;
        uitkomst = x / 4;

    }

    public void paint(Graphics g) {
    g.drawString("idereen krijgt :  " + uitkomst,70,70);
    }
}
