package hoofdstuk_13;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_4 extends Applet {

    int breete;
    int lengte;
    Color kleur;


    public void init() {

        Button baksteen,beton;

        baksteen = new Button("baksteen");
        beton = new Button("beton");

        baksteen.addActionListener( new baksteenListener());
        beton.addActionListener( new betonListener());

        add(baksteen);
        add(beton);
    }

    public void paint(Graphics g) {
        tekenmuuren(g,breete,lengte,kleur);
    }

    class baksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breete = 35;
            lengte = 25;
            kleur  = Color.red;

            repaint();
        }
    }

    class betonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breete = 75;
            lengte = 50;
            kleur  = Color.gray;

            repaint();
        }
    }

    void tekenmuuren ( Graphics g, int breed, int lang, Color kleur) {

        int x = 100;
        int y = 100;
        int reset = 5;

        for (int i = 0; i < 18 ; i++) {

            x += breed;
            g.setColor(kleur);
            g.fillRect(x,y,breed,lang);
            g.setColor(Color.black);
            g.drawRect(x,y,breed,lang);

            if ( i == reset){
                y += lang;
                reset += 6;
                x = 100;
            }
        }
    }
}