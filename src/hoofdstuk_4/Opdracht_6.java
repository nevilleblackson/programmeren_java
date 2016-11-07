package hoofdstuk_4;

/**
 * Created by Gebruiker on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht_6 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {

        g.fillRect(150,435,15,400);
        g.setColor(Color.white);
        g.fillRect(75,75,150,430);
        g.setColor(Color.red);
        g.fillArc(100,100,100,100,360,360);
        g.setColor(Color.orange);
        g.fillArc(100,250,100,100,360,360);
        g.setColor(Color.green);
        g.fillArc(100,400,100,100,360,360);
    }
}
