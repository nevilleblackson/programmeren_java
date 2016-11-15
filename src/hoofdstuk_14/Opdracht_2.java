package hoofdstuk_14;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_2 extends Applet {

    double r, r2;
    int worp, worp2;
    private String[] kaart = {"ruiten een", "ruiten twee", " ruiten drie", " ruiten fier", " ruiten vijf", " ruiten zes", "ruiten zeven", " ruiten acht", "ruiten negen", "ruiten tien", " ruiten boer", "ruiten vrouw", " ruiten heer", "ruiten aas",
            "harten een", "harten twee", " harten drie", " harten fier", " harten vijf", " harten zes", "harten zeven", " harten acht", "harten negen", "harten tien", " harten boer", "harten vrouw", " harten heer", "harten aas",
            "klaveren een", "klaveren twee", " klaveren drie", " klaveren fier", " klaveren vijf", " klaveren zes", "klaveren zeven", " klaveren acht", "klaveren negen", "klaveren tien", " klaveren boer", "klaveren vrouw", " klaveren heer", "klaveren aas",
            "schoppen een", "schoppen twee", " schoppen drie", " schoppen fier", " schoppen vijf", " schoppen zes", "schoppen zeven", " schoppen acht", "schoppen negen", "schoppen tien", " schoppen boer", "schoppen vrouw", " schoppen heer", "schoppen aas"};
    String[] p1, p2, p3, p4;

    public void init() {
        p1 = new String[13];
        p2 = new String[13];
        p3 = new String[13];
        p4 = new String[13];
    }

    public void paint(Graphics g) {

        for (int i = 0; i < p1.length; i++) {

            r = Math.random();
            worp = (int) (r * kaart.length);
            p1[i] = kaart[worp];
            g.drawString(p1[i], 100, 50 * i + 20);

            r = Math.random();
            worp = (int) (r * kaart.length);
            p2[i] = kaart[worp];
            g.drawString(p2[i], 300, 50 * i + 20);

            r = Math.random();
            worp = (int) (r * kaart.length);
            p3[i] = kaart[worp];
            g.drawString(p3[i], 500, 50 * i + 20);

            r = Math.random();
            worp = (int) (r * kaart.length);
            p4[i] = kaart[worp];
            g.drawString(p4[i], 700, 50 * i + 20);
        }
    }
}