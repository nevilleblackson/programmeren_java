
package hoofdstuk_13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        boom(g, 4);
    }


    void boom(Graphics g, int aantalrijen) {

        int x, x2, y, y2, x3, length;
        x = 100;
        y = 100;
        x2 = 150;
        length = 300;
        y2 = 30;
        x3 = 50;
        //aantalrijen = aantalrijen *

        for (int i = 0; i < 10; i++) {
            x += 200;
            x2 += 200;
            x3 += 200;

            g.fillRect(50, 50, 100, 100);
            g.drawLine(x, y, x, length);
            g.drawLine(x2, y, x2, length);
            g.setColor(Color.green);
            g.fillArc(x3, y2, 150, 150, 360, 360);
            g.setColor(Color.black);

            if (i == 5) {
                x = 100;
                x2 = 150;
                x3 = 50;
            }
        }
    }
}