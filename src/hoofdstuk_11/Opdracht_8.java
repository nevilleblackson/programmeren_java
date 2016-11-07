package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_8 extends Applet {


    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int one = 50;

        while(teller < 100) {

            g.drawArc(100,100,one,one,360,360);
            one += 10;
            teller++;
        }
    }
}