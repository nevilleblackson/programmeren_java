package hoofdstuk_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht_3 extends Applet {
    TextField text;
    Label name;
    String s, tekst;
    int maand;

    public void init() {
        text = new TextField("", 20);
        name = new Label("Type de maandnumber");
        text.addActionListener( new TextListener() );
        tekst = "";
        add(name);
        add(text);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            maand = Integer.parseInt( s);
            switch(maand) {
                case 1:
                    tekst = "januari" +"   "+ "31";
                    break;
                case 2:
                    tekst = "febuari"+"   "+ "28/29";
                    break;
                case 3:
                    tekst = "maart"+"   "+ "31";
                    break;
                case 4:
                    tekst = "april" +"   "+ "30";
                    break;
                case 5:
                    tekst = "mei" +"   "+ "31";
                    break;
                case 6:
                    tekst = "juni" +"   "+ "30";
                    break;
                case 7:
                    tekst = "juli" +"   "+ "31";
                    break;
                case 8:
                    tekst = "augustus" +"   "+ "31";
                    break;
                case 9:
                    tekst = "september" +"   "+ "30";
                    break;
                case 10:
                    tekst = "oktober" +"   "+ "31";
                    break;
                case 11:
                    tekst = "november" +"   "+ "30";
                    break;
                case 12:
                    tekst = "december" +"   "+ "31";
                    break;
                default :
                    tekst = "dat is geen maand nummer" ;
            }
            repaint();
        }
    }
}