package hoofdstuk_14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

public class Praktijkopdracht extends Applet {

    private boolean zet = true;
    private TextField Text;
    private int aantal = 23;
    private int spelerzet;
    private int computerzet;
    private String wiewint;
    private Image afbeelding;

    public void init() {
        Text = new TextField("",10);

        Text.addActionListener(new spelTextListener());

        add(Text);

        URL pad = Praktijkopdracht.class.getResource("/images/");
        afbeelding = getImage(pad, "heart symbol.png");
    }

    public void paint(Graphics g) {

        if(!zet) {
            zet = true;
            g.setColor(Color.red);
            g.drawString("getal tussen 1 en 3",40,60);
            g.setColor(Color.black);
        }

            if (aantal > 0) {

                int x = 50;
                int y = 100;

                for (int i = 0; i < aantal; i++) {
                    g.drawImage(afbeelding, x, y, 20, 20, this);

                    x += 50;
                    if(i % 4 == 3){
                        x = 50;
                        y += 50;
                    }
                }
                g.drawString("laatste zet speler" + spelerzet, 200, 50);
                g.drawString("laatste zet comp" + computerzet, 200, 70);
            }
            else {
                g.drawString(wiewint, 100, 100);
            }
        }


    private int Cset() {
        int END = 0;

        double r;
        int r2;

        r = Math.random();
        r2 = (int) (r * 3 + 1);
        int c;

        c = aantal % 4;

        if (c == 0) {
            END = 3;
        }

        if (c == 1) {
            END = r2;
        }

        if (c == 2) {
            END = 1;
        }

        if (c == 3) {
            END = 2;
        }
        return END;
    }

    private class spelTextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String a = Text.getText();
            int spelertussenstap = Integer.parseInt(a);

            if(spelertussenstap < 4 && spelertussenstap > 0) {

                spelerzet = spelertussenstap;
                aantal -= spelerzet;
                if (aantal < 1) {
                    wiewint = "je hebt verloren";
                } else {

                    computerzet = Cset();
                    aantal -= computerzet;
                    if (aantal < 0) {
                        wiewint = "je hebt gewonnen";
                    }

                }
            }

            else{
                zet = false;
            }
            repaint();
        }
    }
}