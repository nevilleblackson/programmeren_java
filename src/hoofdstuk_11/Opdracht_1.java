package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {





    public void init() {}

    public void paint(Graphics g) {
        int teller = 0;
        int x = 0;

        while(teller < 10) {
            x += 50;
            g.drawLine(x ,100, x,300 );
            teller++;
        }
    }
}