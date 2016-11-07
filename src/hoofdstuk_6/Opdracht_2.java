package hoofdstuk_6;


import java.awt.*;
        import java.applet.*;

public class Opdracht_2 extends Applet {


    int  min,uur,dag,week,maand, spmaand,jaar;

    public void init() {

        min = 60;
        uur = min* 60;
        dag = uur * 24;
        week = dag * 7;
        maand = dag* 30;
        spmaand = dag * 31;
        jaar = dag * 360;


    }

    public void paint(Graphics g) {

        g.drawString("in een uur zitten : " + uur + " sec" , 50,50);
        g.drawString("in een dag zitten : " + dag + " sec" , 50,100);
        g.drawString("in een jaar zitten : " + jaar + " sec" , 50,150);


    }
}