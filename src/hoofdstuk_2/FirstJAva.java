package hoofdstuk_2;

/**
 * Created by Gebruiker on 8-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class FirstJAva extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("neville", 50, 60 );
    }
}