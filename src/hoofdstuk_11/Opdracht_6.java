package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int one = 100;
        int two = 100;

        while(teller < 6) {

            g.drawArc(one,one,two,two,360,360);
            one += 10;
            two -= 20;
            teller++;
        }
    }
}
