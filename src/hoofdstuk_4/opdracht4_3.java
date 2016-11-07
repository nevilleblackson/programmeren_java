package hoofdstuk_4;

/**
 * Created by Gebruiker on 8-9-2016.
 */
import java.awt.*;
        import java.applet.*;

public class opdracht4_3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.fillRect(50,50,5,700);
        g.drawRect(50,50,450,300);
        g.setColor(Color.red);
        g.fillRect(50,50,450,100);
        g.setColor(Color.blue);
        g.fillRect(50,250,450,100);
    }
}
