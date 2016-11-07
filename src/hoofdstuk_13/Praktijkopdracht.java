
package hoofdstuk_13;

        import java.awt.*;
        import java.applet.*;

public class Praktijkopdracht extends Applet {



    public void init() {

    }

    public void paint(Graphics g) {
        boom(g);
    }

    void boom ( Graphics g) {

        g.drawArc(150,150,100,300,270,180);
        g.drawArc(300,150,100,300,90,180);

        g.fillArc(175,20,170,170,360,360);

        int a = 150,b= 80,c= 70,d= 125,e= 180;

        for (int i = 0; i <4 ; i++) {

            g.fillArc(a,b,c,c,d,e);

            a += 20;
            b -= 30;
            c += 0;
            d -= 40;
            e += 0;

        }

        a = 230;
        b= 0;
        c= 70;
        d= -35;
        e= 180;

        for (int i = 0; i <4 ; i++) {

            g.fillArc(a,b,c,c,d,e);

            a += 25;
            b += 30;
            c += 0;
            d -= 35;
            e += 0;
        }
    }
}