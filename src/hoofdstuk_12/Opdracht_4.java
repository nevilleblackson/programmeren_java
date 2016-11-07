package hoofdstuk_12;


import java.awt.*;
import java.applet.*;

public class Opdracht_4 extends Applet{
    private boolean gevonden;
    private double[] salaris = { 100.0, 200.0, 500.0, 400.0, 300.0 };

    public void init() {
        double gezocht = 400;
        gevonden = false;
        int teller = 0;
        while(teller < salaris.length) {
            if(salaris[teller] == gezocht &&!(gevonden)) {
                gevonden = true;
            }
            teller ++;
        }
    }

    public void paint(Graphics g) {
        if(gevonden) {
            g.drawString("De waarde is gevonden.", 100, 100);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 100, 100);
        }
    }
}