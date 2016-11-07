package hoofdstuk_13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_3 extends Applet {



    public void init() {
    }

    public void paint(Graphics g) {
        tekenmuur(g,75,50);
    }

    void tekenmuur ( Graphics g, int x2, int y2) {

        int x = 100;
        int y = 100;
        int reset = 5;

        for (int i = 0; i < 18 ; i++) {

            x += x2;
            g.setColor(Color.red);
            g.fillRect(x,y,x2,y2);
            g.setColor(Color.black);
            g.drawRect(x,y,x2,y2);

            if ( i == reset){
                y += y2;
                reset += 6;
                x = 100;
            }
        }
    }
}