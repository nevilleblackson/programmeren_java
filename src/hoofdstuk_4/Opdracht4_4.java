package hoofdstuk_4;
        import java.awt.*;
        import java.applet.*;

public class Opdracht4_4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {

        g.fillRect(50,30,3,600);
        g.drawString("Valerie", 120,650 );
        g.drawString("Jeroen", 220, 650 );
        g.drawString("Hans", 320, 650 );
        g.drawString("kg", 30,30);
        g.drawString("10 ", 10, 580 );
        g.drawString("20 ", 10, 520 );
        g.drawString("30 ", 10, 460 );
        g.drawString("40 ", 10, 400 );
        g.drawString("50 ", 10, 340 );
        g.drawString("60 ", 10, 280 );
        g.drawString("70 ", 10, 220 );
        g.drawString("80 ", 10, 160 );
        g.drawString("90 ", 10,100 );
        g.drawString("100 ", 10,40);

        g.setColor(Color.red);
        g.fillRect(100,400,75,240);
        g.setColor(Color.green);
        g.fillRect(200,40,75,600);
        g.setColor(Color.blue);
        g.fillRect(300,160,75,480);



    }
}
