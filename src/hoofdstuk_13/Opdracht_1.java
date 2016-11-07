package hoofdstuk_13;

import java.awt.*;
import java.applet.*;

public class Opdracht_1 extends Applet {

    Button b,c,d,e,f;
    Button[] a;

    public void init() {

        a = new Button[5];
        b = new Button("blauw");
        c = new Button("rood");
        d = new Button("geel");
        e = new Button("groen");
        f = new Button("wit");


        add(b);
        add(c);
        add(d);
        add(e);
        add(f);

        /*
        for (int teller = 0; teller < b.length; teller++) {

            b[teller] = new Button("ok");
            add(b[teller]);
        }
        */
    }

    public void paint(Graphics g) {

        // tekenDriehoek(g,100,276,300,460,200,300);
    }

    void tekenDriehoek ( Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {

        g.drawLine(x1,y1,x2,y2);
        g.drawLine(x2,y2,x3,y3);
        g.drawLine(x3,y3,x1,y1);

    }
}