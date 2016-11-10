package hoofdstuk_14;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField spelText;
    int aantal = 23;
    boolean zet;
    Button[] heey;
    int spelTexta;

    public void init() {

        heey = new Button[aantal];
        for (int i = 0; i <heey.length ; i++) {
            heey[i] = new Button("1");
            add(heey[i]);
        }

        spelText = new TextField("",10);

        spelText.addActionListener(new spelTextListener());

        add(spelText);
    }

    public void paint(Graphics g) {
        g.drawString("" + aantal,100,100);
        g.drawString("laatste zet speler"+ spelTexta,300,300);
        g.drawString("laatste zet comp"+ Cset(),300,330);
    }

    int Cset () {

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

            aantal = aantal - Cset();

            repaint();
        }
    }
}
