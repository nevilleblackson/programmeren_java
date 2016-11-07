package hoofdstuk_8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_3 extends Applet {

    TextField Text;
    Label Textname;
    Button OK;
    double S;
    double T;

    public void init() {

        Text = new TextField("",20);
        Textname = new Label("BTW berekenen");
        OK = new Button ("OK");

        OK.addActionListener(new OKListener());
        Text.addActionListener(new TextListener());

        add(Text);
        add(Textname);
        add(OK);
    }


    public void paint(Graphics g) {
        g.drawString("" + T , 100, 100);
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Text.getText();
            S = Double.parseDouble( s );
            T = S * 1.21;

            repaint();
        }
    }

    class OKListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = Text.getText();
            S = Double.parseDouble( s );

            T = S * 1.21;
            repaint();

        }
    }
}