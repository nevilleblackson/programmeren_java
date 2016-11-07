package hoofdstuk_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_5 extends Applet {

    TextField text;
    Button gem;
    Label name;
    String s,T;
    double zin,zin2, zin3, zin4, zin5, zin6, zin7, zin8, zin9, zin10,Stap,S;
    double Getal ,C,aantal;


    public void init() {
        text = new TextField("",20);
        gem = new Button ("gemiddelde");
        text.addActionListener( new TextListener());
        gem.addActionListener( new OKListener());

        zin = 0;
        zin2 = 0;
        zin3 = 0;
        zin4 = 0;
        zin5 = 0;
        zin6 = 0;
        zin7 = 0;
        zin8 = 0;
        zin9 = 0;
        zin10 = 0;

        add(text);
        add(gem);
        T = "";
    }

    public void paint(Graphics g) {

        g.drawString("" + T , 200,150 );
        g.drawString("" + S , 200,200);



    }


    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            S = Stap / aantal;

            if ((S >= 5.5)){
                T = "geslaagd";
            }
            else {
                T = "niet geslaagd";
            }
            repaint();
        }
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = text.getText();
            Getal = Integer.parseInt(s);

                Stap += Getal;
                aantal += 1;

            if ((Getal >= 5.5)){
                T = "voldoende";
            }
            else {
                T = "onvoldoende";
            }
            repaint();
        }

    }
}