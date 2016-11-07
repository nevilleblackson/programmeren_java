package hoofdstuk_8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class staafdiagram extends Applet {
//lijn puntem

    int linestart = 100;
    int linelength = 500;
    int lineY = linestart + linelength;  //kruispunt
    int stringstart = linestart - 40;
    int zeroline = lineY / 100 * 6;
    int negstringstart = stringstart + 80;
    int lineYname = lineY + 15;


// special cords

    int kg10 = lineY / 100 * 90;
    int kg20 = lineY / 100 * 80;
    int kg30 = lineY / 100 * 70;
    int kg40 = lineY / 100 * 60;
    int kg50 = lineY / 100 * 50;
    int kg60 = lineY / 100 * 40;
    int kg70 = lineY / 100 * 30;
    int kg80 = lineY / 100 * 20;
    int kg90 = lineY / 100 * 10;
    int kg100 = lineY / 100 ;


    // kg personennaam

    int kgvalerie = kg40;
    int kgjeroen = kg100;
    int kghans = kg80;
    Color valCo = Color.green;
    Color jerCO = Color.blue;
    Color haCO = Color.CYAN;
    Color ZeroCO = Color.black;

    // rect rods

    int valname = lineY / 4;
    int jername = lineY / 4 * 2;
    int hanname = lineY / 4 * 3;
    int valend = lineY - kgvalerie;
    int jerend = lineY - kgjeroen;
    int hanend = lineY - kghans;
    int length = lineY / 5;


    TextField valText;
    TextField hanText;
    TextField jerText;
    Button wijzig;

    double D;
    double E;
    double F;


    public void init() {

        valText = new TextField("", 15);
        hanText = new TextField("", 15);
        jerText = new TextField("", 15);
        wijzig = new Button("wijzig");

        wijzig.addActionListener(new wijigListener());

        add(valText);
        add(hanText);
        add(jerText);
        add(wijzig);

    }

    public void paint(Graphics g) {

        g.drawLine(linestart, zeroline, linestart, lineY);
        g.drawLine(linestart, lineY, lineY, lineY);


        g.drawString("kilogram", negstringstart, zeroline);
        g.drawString("0", stringstart, lineY);
        g.drawString("10", stringstart, kg10);
        g.drawString("20", stringstart, kg20);
        g.drawString("30", stringstart, kg30);
        g.drawString("40", stringstart, kg40);
        g.drawString("50", stringstart, kg50);
        g.drawString("60", stringstart, kg60);
        g.drawString("70", stringstart, kg70);
        g.drawString("80", stringstart, kg80);
        g.drawString("90", stringstart, kg90);
        g.drawString("100", stringstart, kg100);

        g.drawString("valarie", valname, lineYname);
        g.drawString("hans", hanname, lineYname);
        g.drawString("jeroen", jername, lineYname);

        g.setColor(valCo);
        g.fillRect(valname, kgvalerie, length, valend);
        g.setColor(haCO);
        g.fillRect(hanname, kghans, length, hanend);
        g.setColor(jerCO);
        g.fillRect(jername, kgjeroen, length, jerend);
        g.setColor(ZeroCO);
    }


    class wijigListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String A = hanText.getText();
            String B = valText.getText();
            String C = jerText.getText();

            D = Double.parseDouble( A );
            E = Double.parseDouble( B );
            F = Double.parseDouble( C );

            kghans = (int)   (lineY / 100 * (100 - D ));
            kgjeroen = (int) (lineY / 100 * (100 - F ));
            kgvalerie = (int)(lineY / 100 * (100 - E ));

             valend = lineY - kgvalerie;
             jerend = lineY - kgjeroen;
             hanend = lineY - kghans;

                    repaint();
        }

    }

}
