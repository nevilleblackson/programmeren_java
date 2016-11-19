package hoofdstuk_14;

import java.applet.Applet;
import java.awt.*;

public class Opdracht_2 extends Applet {

    private String[] kaart = {"ruiten een", "ruiten twee", " ruiten drie", " ruiten fier", " ruiten vijf", " ruiten zes", "ruiten zeven", " ruiten acht", "ruiten negen", "ruiten tien", " ruiten boer", "ruiten vrouw", " ruiten heer", "ruiten aas",
            "harten een", "harten twee", " harten drie", " harten fier", " harten vijf", " harten zes", "harten zeven", " harten acht", "harten negen", "harten tien", " harten boer", "harten vrouw", " harten heer", "harten aas",
            "klaveren een", "klaveren twee", " klaveren drie", " klaveren fier", " klaveren vijf", " klaveren zes", "klaveren zeven", " klaveren acht", "klaveren negen", "klaveren tien", " klaveren boer", "klaveren vrouw", " klaveren heer", "klaveren aas",
            "schoppen een", "schoppen twee", " schoppen drie", " schoppen fier", " schoppen vijf", " schoppen zes", "schoppen zeven", " schoppen acht", "schoppen negen", "schoppen tien", " schoppen boer", "schoppen vrouw", " schoppen heer", "schoppen aas"};
    private String[] p1, p2, p3, p4;

    public void init() {
        p1 = new String[13];
        p2 = new String[13];
        p3 = new String[13];
        p4 = new String[13];

        kaarten(p1);
        kaarten(p2);
        kaarten(p3);
        kaarten(p4);
    }

    public void paint(Graphics g) {

        for (int i = 0; i < p1.length; i++) {
            g.drawString(p1[i],50,50 * i + 10);
            g.drawString(p2[i],250,50 * i + 10);
            g.drawString(p3[i],450,50 * i + 10);
            g.drawString(p4[i],650,50 * i + 10);
        }
    }

    private String[] kaarten(String[] k) {
        int schud;

        for (int i = 0; i < k.length ; i++) {
            double r = Math.random();
            schud = (int) (r * kaart.length);
            k[i] = kaart[schud];

            String[] deck = new String[kaart.length - 1];

            int j2 = 0;
            for (int j = 0; j < deck.length ; j++) {

                if(j2 == schud){
                    j2 += 1;
                }
                deck[j] = kaart[j2];
                j2++;
            }
            kaart = deck;

        }
        return k;
    }
}