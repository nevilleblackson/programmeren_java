
package hoofdstuk_13;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht extends Applet {


    public void init() {

    }

    public void paint(Graphics g) {
        boom(g, 10);
    }


    void boom(Graphics g, int aantalrijen) {

        int x, y, x2, y2;

        x = 100;
        y = 100;
        x2 = 80;
        y2 = 60;
        int X = 4;

        for (int i = 0; i < aantalrijen; i++) {
            x += 100;
            x2 += 100;

            g.setColor(Color.black);
            g.fillRect(x, y, 30, 100);
            g.setColor(Color.green);
            g.fillArc(x2, y2, 70, 70, 360, 360);

            if (i == X) {
                y += 180;
                y2 += 180;
                x = 100;
                x2 = 80;
                X += 5;
            }
        }
    }
}
