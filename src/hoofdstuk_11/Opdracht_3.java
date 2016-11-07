package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_3 extends Applet {
    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int antwoord = 1;
        int laats = 0;
        int n = 1;
        int y = 0;

        while(teller < 20) {

            g.drawString(""+ antwoord ,100,y);
            y += 50;

            antwoord = laats + n;
            n = laats;
            laats = antwoord;

            teller++;
        }
    }



}
