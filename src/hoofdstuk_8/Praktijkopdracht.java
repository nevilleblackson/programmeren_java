package hoofdstuk_8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {



    TextField Firstnumber;
    TextField Secondnumber;
    Button plus;
    Button min;
    Button gedeelddoor;
    Button keer;
    Double uitkomst = 0.0;
    Double A;
    Double B;

    public void init() {

        Firstnumber = new TextField("",20);
        Secondnumber  = new TextField("",20);
        plus = new Button("+");
        min = new Button("-");
        gedeelddoor = new Button("/");
        keer = new Button("*");

        plus.addActionListener(new plusListener());
        min.addActionListener(new minListener());
        gedeelddoor.addActionListener(new gedeelddoorListener());
        keer.addActionListener(new keerListener());

        add(Firstnumber);
        add(Secondnumber);
        add(plus);
        add(min);
        add(gedeelddoor);
        add(keer);


    }



    public void paint(Graphics g) {
        g.drawString("" + uitkomst,100,100);




    }

    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String C = Firstnumber.getText();
            String D = Secondnumber.getText();

            A = Double.parseDouble( C );
            B = Double.parseDouble( D );
            uitkomst = A + B;

            repaint();

        }
    }

    class gedeelddoorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String C = Firstnumber.getText();
            String D = Secondnumber.getText();

            A = Double.parseDouble( C );
            B = Double.parseDouble( D );
            uitkomst = A / B;

            repaint();
        }
    }

    class keerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String C = Firstnumber.getText();
            String D = Secondnumber.getText();

            A = Double.parseDouble( C );
            B = Double.parseDouble( D );
            uitkomst = A * B;

            repaint();
        }
    }

    class minListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String C = Firstnumber.getText();
            String D = Secondnumber.getText();

            A = Double.parseDouble( C );
            B = Double.parseDouble( D );
            uitkomst = A - B;

            repaint();
        }
    }

}
