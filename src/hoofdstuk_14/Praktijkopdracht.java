package hoofdstuk_14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    private TextField spelText;
    private int aantal = 23;
    private int spelTexta;
    private int compzet;
    private String win;

    public void init() {
        spelText = new TextField("",10);

        spelText.addActionListener(new spelTextListener());

        add(spelText);
    }

    public void paint(Graphics g) {
        if (aantal > 0) {
            g.drawString("" + aantal, 100, 100);
            g.drawString("laatste zet speler" + spelTexta, 200, 200);
            g.drawString("laatste zet comp" + compzet, 200, 230);
        }
        else {
            g.drawString(win , 100,100);
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
                END = 2;
            }

            if (c == 2) {
                END = 1;
            }

            if (c == 3) {
                END = r2;
            }

    return END;
    }

    private class spelTextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String a = spelText.getText();
            spelTexta = Integer.parseInt(a);

            aantal -= spelTexta;

            if (aantal == 0) {
                win = "je hebt gewonnen";
            }

            compzet = Cset();
            aantal -= compzet;

            if (aantal == 0) {
                win = "je hebt verloren";
            }
            repaint();
        }
    }
}
