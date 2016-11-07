package hoofdstuk_5;

import java.awt.*;
import java.applet.*;

public class Opdracht_5 extends Applet {

//cords first 2 x+y

    int firstrow =40 ;
    int secondrow = 340;
    int thirthrow = 640 ;

    int firstcolumn = 40 ;
    int secondcolumn = 140;
    int thirthcolumn = 340;

    //cords last 2 x+y(2)

    int length = 260;
    int lengthLine = length + firstrow;
    int breete = 140 ;

    // round
    int round = 60;
    int circle = 360;
    int taartpunt = 45;

    public void init() {

    }

    public void paint(Graphics g) {

        g.drawLine(firstrow,firstcolumn,lengthLine,firstrow);
        g.drawRect(firstrow,secondcolumn,length,breete);
        g.drawRoundRect(firstrow,thirthcolumn,length,breete,round,round);

        g.setColor(Color.pink);
        g.fillRect(secondrow,secondcolumn,length,breete );
        g.fillOval(secondrow,thirthcolumn,length,breete );
        g.setColor(Color.black);
        g.drawOval(secondrow,secondcolumn,length,breete );

        g.setColor(Color.pink);
        g.fillArc(thirthrow,secondcolumn,length,breete,circle,taartpunt);
        g.setColor(Color.black);
        g.drawArc(thirthrow,thirthcolumn,breete,breete,circle,circle);
        g.drawOval(thirthrow,secondcolumn,length,breete);
    }
}
