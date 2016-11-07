package hoofdstuk_6;

import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    double a,b,c,stp2,antwoord;
    int stp3 , wtf;




    public void init() {

        a = 5.9;
        b = 6.3;
        c = 6.9;
        stp2 =  (a + b + c) / 3 *10;
        stp3 = (int) stp2;

        antwoord = (double) stp3 / 10;



    }

    public void paint(Graphics g) {
        g.drawString("gemidelde is " + antwoord  , 50 , 50 );
    }
}