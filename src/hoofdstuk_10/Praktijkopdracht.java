package hoofdstuk_10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField text;
    Label name;
    String s, tekst;
    int cijver;

    public void init() {
        text = new TextField("", 20);
        name = new Label("Type een cijver");
        text.addActionListener( new TextListener() );
        tekst = "";
        add(text);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = text.getText();
            cijver = Integer.parseInt( s);
            switch(cijver) {
                case 1:
                    tekst = "slecht";
                    break;
                case 2:
                    tekst = "slecht";
                    break;
                case 3:
                    tekst = "slecht";
                    break;
                case 4:
                    tekst = "onvoldoende";
                    break;
                case 5:
                    tekst = "matig";
                    break;
                case 6:
                    tekst = "voldoende";
                    break;
                case 7:
                    tekst = "voldoende";
                    break;
                case 8:
                    tekst = "goed";
                    break;
                case 9:
                    tekst = "goed";
                    break;
                case 10:
                    tekst = "goed";
                break;
                default:
                    tekst = "U heeft een verkeerd nummer ingevoerd!";
                    break;
            }
            repaint();
        }
    }
}
