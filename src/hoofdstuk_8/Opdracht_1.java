package hoofdstuk_8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht_1 extends Applet {

    TextField Text;
    Label name;
    Button accept;
    Button restart;
    String S;

    public void init() {

        Text = new TextField("", 40);
        name = new Label("Type een zin");
        restart = new Button("Clear");
        accept = new Button("OK");

        restart.addActionListener(new restartListener());
        accept.addActionListener(new acceptListener());

        add(Text);
        add(accept);
        add(restart);
        add(name);
        S = "";
    }



    public void paint(Graphics g) {
        g.drawString(S,100,100);
    }

    class restartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = "";

            repaint();

        }
    }

    class acceptListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = Text.getText();

            repaint();
        }
    }

}
