package hoofdstuk_5;

import java.awt.*;
import java.applet.*;

public class Opdracht5_2 extends Applet {

    // 0.25 0.50 0.75

    int prbl1 = 1 / 4;
    int prbl2 = 2 / 4;
    int prbl3 = 3 / 4;

//lijn puntem

    int linestart = 100;
    int linelength = 500;
    int lineY = linestart + linelength;  //kruispunt
    int stringstart = linestart - 40;
    int zeroline = lineY / 100 * 6 + prbl1;
    int negstringstart = stringstart + 80;
    int lineYname = lineY + 15;



// special cords

    int kg10 = lineY / 100 * 93 + prbl3;
    int kg20 = lineY / 100 * 87 + prbl2;
    int kg30 = lineY / 100 * 81 + prbl1;
    int kg40 = lineY / 100 * 75;
    int kg50 = lineY / 100 * 68 + prbl3;
    int kg60 = lineY /100 * 62 + prbl2;
    int kg70 = lineY / 100 * 56 + prbl1;
    int kg80 = lineY / 100 * 50;
    int kg90 = lineY / 100 * 43 + prbl3;
    int kg100 = lineY / 100 * 37 + prbl2;
    int kg110 = lineY / 100 * 31 + prbl1;
    int kg120 = lineY / 100 * 25;
    int kg130 = lineY / 100 * 18 + prbl3 ;
    int kg140 = lineY / 100 * 12 +prbl2;
    int kg150 = lineY / 100 * 6 + prbl1;


    // kg personennaam

    int kgvalerie = kg40;
    int kgjeroen = kg100;
    int kghans = kg80;
    Color valCo = Color.green;
    Color jerCO = Color.blue;
    Color haCO = Color.CYAN;
    Color ZeroCO = Color.black;

    // rect rods

    int valname = lineY / 4 ;
    int jername = lineY / 4 * 2;
    int hanname = lineY / 4 * 3;
    int valend = lineY - kgvalerie ;
    int jerend = lineY - kgjeroen ;
    int hanend = lineY - kghans ;
    int length = lineY /5 ;


    public void init() {

    }

    public void paint(Graphics g) {

        g.drawLine(linestart,zeroline,linestart,lineY);
        g.drawLine(linestart,lineY,lineY,lineY);


        g.drawString("kilogram",negstringstart, zeroline);
        g.drawString("0",stringstart,lineY);
        g.drawString("10",stringstart, kg10);
        g.drawString("20",stringstart, kg20);
        g.drawString("30",stringstart, kg30 );
        g.drawString("40",stringstart, kg40);
        g.drawString("50",stringstart, kg50);
        g.drawString("60",stringstart, kg60);
        g.drawString("70",stringstart, kg70);
        g.drawString("80",stringstart, kg80);
        g.drawString("90",stringstart, kg90);
        g.drawString("100",stringstart, kg100);
        g.drawString("110",stringstart, kg110);
        g.drawString("120",stringstart, kg120);
        g.drawString("130",stringstart, kg130 );
        g.drawString("140",stringstart, kg140);
        g.drawString("150",stringstart, kg150);

        g.drawString("valarie",valname,lineYname);
        g.drawString("hans",hanname,lineYname);
        g.drawString("jeroen",jername,lineYname);

        g.setColor(valCo);
        g.fillRect(valname,kgvalerie,length,valend);
        g.setColor(haCO);
        g.fillRect(hanname,kghans,length,hanend);
        g.setColor(jerCO);
        g.fillRect(jername,kgjeroen, length,jerend);
        g.setColor(ZeroCO);
    }
}
