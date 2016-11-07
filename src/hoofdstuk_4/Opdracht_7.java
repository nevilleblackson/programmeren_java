package hoofdstuk_4;

/**
 * Created by Gebruiker on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht_7 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    g.drawRect(100,100,500,500);
        g.fillArc(125,125,85,85,360,360);
        g.fillArc(470,470,85,85,360,360);
        g.fillArc(470,125,85,85,360,360);
        g.fillArc(125,470,85,85,360,360);
        g.fillArc(300,300,85,85,360,360);
    }
}
