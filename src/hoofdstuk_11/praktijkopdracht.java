package hoofdstuk_11;

        import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;

public class praktijkopdracht extends Applet {

        private TextField text;
        private int textin = 1;

        public void init() {

                text = new TextField("", 20);
                Button ok = new Button("ok");
                Button next = new Button("volgende");
                Button vorige = new Button("vorige");
                Label tabel = new Label("tabbelen");

                text.addActionListener(new TextListener());
                ok.addActionListener(new TextListener());
                next.addActionListener(new nextListener());
                vorige.addActionListener(new vorigeListener());


                add(tabel);
                add(text);
                add(ok);
                add(vorige);
                add(next);
        }

        public void paint(Graphics g) {

                int teller = 0;
                int x = 30;
                int y = 100;
                int antwoord;
                int stap = 0;

                while (teller < 10) {
                        stap += 1;
                        antwoord = textin * stap;
                        g.drawString("" + stap + " * " + textin + " = " + antwoord, x, y);
                        y += 50;
                        teller++;
                }
        }

        class TextListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        String s = text.getText();
                        textin = Integer.parseInt(s);
                        repaint();
                }
        }

        private class nextListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        textin += 1;
                        repaint();
                }

        }

        private class vorigeListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                        textin -= 1;
                        repaint();
                }
        }
}