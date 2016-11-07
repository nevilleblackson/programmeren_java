package hoofdstuk_4;

/**
 * Created by Gebruiker on 9-9-2016.
 */
import java.awt.*;
import java.applet.*;

public class Praktijkopdracht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
    g.drawLine(50,50,200,50);
        g.drawRect(50,100,200,200);
        g.drawRoundRect(100,300,300,100,50,50);
        g.setColor(Color.magenta);
        g.fillArc(500,300,300,200,360,360);
        g.fillRect(500,100,300,200);
        g.setColor(Color.black);
        g.drawArc(500,100,300,200,360,360);
        g.drawArc(1000,75,200,200,360,360);
        g.drawArc(1000,300,300,175,360,360);
        g.setColor(Color.red);
        g.fillArc(1000,75,200,200,360,45);
    }
}

