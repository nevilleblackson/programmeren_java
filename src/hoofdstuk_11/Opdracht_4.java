package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_4 extends Applet {


    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int n = 3;
        int s = 0;
        int antwoord = 0;
        int y = 0;

        while(teller < 11) {

            antwoord = n * s;
            g.drawString(""+ antwoord ,100,y);
            y += 50;
            s += 1;
            teller++;
        }
    }

}

