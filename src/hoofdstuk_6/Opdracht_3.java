package hoofdstuk_6;

import java.awt.*;
import java.applet.*;

public class Opdracht_3 extends Applet {

    int a,b,antwoord;

    public void init() {

        b = 360;
        a = 90;
        antwoord = a - b;
    }

    public void paint(Graphics g) {
        g.drawString("het antwoord is " + antwoord , 50 ,50);

    }
}