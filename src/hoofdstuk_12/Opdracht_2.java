package hoofdstuk_12;

import java.awt.*;
import java.applet.*;

public class Opdracht_2 extends Applet {
    Button[] B;

    public void init() {

        B = new Button[25];

        for (int teller = 0; teller < B.length; teller++) {

            B[teller] = new Button("ok");
            add(B[teller]);
        }
    }

    public void paint(Graphics g) {

    }
}