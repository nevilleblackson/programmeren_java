package hoofdstuk_4;

/**
 * Created by Gebruiker on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.drawRect(250,250,500,500);
        g.drawLine(250,250,600,50);
        g.drawLine(600,50,750,250);
        g.drawRect(450,300,150,150);
        g.drawRect(450,550,150,200);
    }
}
