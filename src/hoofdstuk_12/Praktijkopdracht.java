package hoofdstuk_12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {
    int i = 0;
    private boolean klaar = false;
    private String[] namen;
    private int[] telefoon;
    private TextField TextN;
    private TextField TextT;

    public void init() {


        TextN = new TextField("", 10);
        TextT = new TextField("", 10);
        Label tel = new Label("telefoon nummer");
        Label naam = new Label("naam");
        Button ok = new Button("ok");
        namen = new String[10];
        telefoon = new int[10];

        ok.addActionListener(new TextListener());
        TextN.addActionListener(new TextListener());
        TextT.addActionListener(new TextListener());

        add(naam);
        add(TextN);
        add(tel);
        add(TextT);
        add(ok);
    }

    public void paint(Graphics g) {


        if (klaar) {
            for (int teller = 0; teller < namen.length; teller++) {
                g.drawString(namen[teller], 100, 30 * teller + 20);
                g.drawString("" + telefoon[teller], 200, 30 * teller + 20);
            }
        }

    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            // klaar = true;
            String N = TextN.getText();
            String tex = TextT.getText();
            int T = Integer.parseInt(tex);

            namen[i] = N;
            telefoon[i] = T;

            if (i == 10) {
                klaar = true;
            }

            i += 1;
            repaint();
        }

    }
}