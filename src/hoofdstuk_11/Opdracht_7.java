package hoofdstuk_11;

import java.awt.*;
import java.applet.*;

public class Opdracht_7 extends Applet {


    public void init() {}

    public void paint(Graphics g) {

        int teller = 0;
        int one = 200;
        int two = 490;

        while(teller < 51) {

            g.drawArc(one,one,two,two,360,360);
            one += 5;
            two -= 10;
            teller++;
        }
    }
}