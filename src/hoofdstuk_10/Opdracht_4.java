package hoofdstuk_10;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht_4 extends Applet {
    TextField text, jaar;
    Label name;
    String s,b, tekst,zin;
    int maand, jaar2;
    Button ok;

    public void init() {
        text = new TextField("maand nummer", 20);
        jaar = new TextField("jaar", 20);
        name = new Label("Type de maandnumber");
        ok = new Button ("ok");
        ok.addActionListener( new okListener() );
        tekst = "";
        b = "";
        add(name);
        add(jaar);
        add(text);
        add(ok);
    }

    public void paint(Graphics g) {

        g.drawString( b +  "   "+ tekst, 50, 60 );



    }

    class okListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            maand = Integer.parseInt( s);
            b = jaar.getText();
            jaar2 = Integer.parseInt( b );

            if ( (jaar2 % 4 == 0 && !(jaar2 % 100 == 0)) ||
                    jaar2 % 400 == 0 ) {
                zin = "29";
            }
            else {
                zin = "28";
            }


            switch(maand) {
                case 1:
                    tekst = "januari" +"   "+ "31";
                    break;
                case 2:
                    tekst = "febuari"+"   "+ zin;
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