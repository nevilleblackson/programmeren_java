package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_5 extends Applet {



    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int x = 30;
        int y = 30;

        while(teller < 10) {

            g.drawRect(x,y,50,50);
            y += 50;
            x += 50;
            teller++;
        }
    }
}
