package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        int teller = 0;
        int n = 21;
        int y = 0;

        while (teller < 11) {
            y += 50;
            n -= 1;
            g.drawString("" + n, 100, y);
            teller++;
        }
    }
}