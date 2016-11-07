package hoofdstuk_8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdarcht_2 extends Applet {

    Button mannen;
    Button vrouwen;
    Button jongens;
    Button meisjes;
    int M;
    int V;
    int J;
    int Me;

    public void init() {

        mannen = new Button("Mannen");
        vrouwen = new Button("vrouwen");
        jongens = new Button("jongens");
        meisjes = new Button("meisjes");

        mannen.addActionListener(new mannenListener());
        vrouwen.addActionListener(new vrouwenListener());
        jongens.addActionListener(new jongensListener());
        meisjes.addActionListener(new meisjesListener());


        add(mannen);
        add(meisjes);
        add(vrouwen);
        add(jongens);



    }


    public void paint(Graphics g) {

        g.drawString("" + M, 100, 100);
        g.drawString("" + Me, 150, 100);
        g.drawString("" + V, 200, 100);
        g.drawString("" + J, 250, 100);
    }

    class mannenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            M  = M +1;

            repaint();
        }
    }

    class vrouwenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            V = V + 1;

            repaint();
        }
    }

    class jongensListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

          J = J +1;

            repaint();
        }
    }

    class meisjesListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Me = Me + 1;

            repaint();
        }
    }
}

