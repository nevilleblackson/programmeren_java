package hoofdstuk_4;

import java.awt.*;
import java.applet.*;

public class Opdracht_5 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(200,200,200,200,360,360);
    }
}
