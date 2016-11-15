package hoofdstuk_14;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_1 extends Applet {

    private int worp;
    private String[] kaart = {"ruiten een", "ruiten twee", " ruiten drie", " ruiten fier", " ruiten vijf", " ruiten zes", "ruiten zeven", " ruiten acht", "ruiten negen", "ruiten tien", " ruiten boer", "ruiten vrouw", " ruiten heer", "ruiten aas",
            "harten een", "harten twee", " harten drie", " harten fier", " harten vijf", " harten zes", "harten zeven", " harten acht", "harten negen", "harten tien", " harten boer", "harten vrouw", " harten heer", "harten aas",
            "klaveren een", "klaveren twee", " klaveren drie", " klaveren fier", " klaveren vijf", " klaveren zes", "klaveren zeven", " klaveren acht", "klaveren negen", "klaveren tien", " klaveren boer", "klaveren vrouw", " klaveren heer", "klaveren aas",
            "schoppen een", "schoppen twee", " schoppen drie", " schoppen fier", " schoppen vijf", " schoppen zes", "schoppen zeven", " schoppen acht", "schoppen negen", "schoppen tien", " schoppen boer", "schoppen vrouw", " schoppen heer", "schoppen aas"};

    public void init() {
        double r = Math.random();
        worp = (int) (r * 56);
    }

    public void paint(Graphics g) {
        g.drawString(kaart[worp], 50, 60);
    }
}