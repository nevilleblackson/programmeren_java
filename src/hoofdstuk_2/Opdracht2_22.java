package hoofdstuk_2;

/**
 * Created by Gebruiker on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Opdracht2_22 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("neville", 50, 60 );
        g.setColor(Color.red);
        g.drawString("blackson", 50, 75 );
    }
}