package hoofdstuk_12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht_3 extends Applet {
    Button ok;
    TextField[] Text;
    int[] SText;

    public void init() {

        Text = new TextField[5];
        SText = new int[5];
        ok = new Button("ok");

        for (int teller = 0; teller < Text.length; teller++) {

            Text[teller] = new TextField("", 5);
            add(Text[teller]);

        }
        ok.addActionListener(new TextfieldListener());
        add(ok);

    }

    public void paint(Graphics g) {

    }

    class TextfieldListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            for (int teller = 0; teller < Text.length; teller++) {
                String s = Text[teller].getText();
                SText[teller] =  Integer.parseInt(s);
            }

            Arrays.sort(SText);

            for (int teller = 0; teller < SText.length; teller++) {
                Text[teller].setText(String.valueOf(SText[teller]));
            }

            repaint();
        }

    }
}