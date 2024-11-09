import java.applet.Applet;
import java.awt.*;

public class Smiley extends Applet{
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(60, 60, 80, 80);
        g.setColor(Color.gray);
        g.fillOval(80, 80, 15, 15);
        g.setColor(Color.gray);
        g.fillOval(110, 80, 15, 15);
        g.setColor(Color.black);
        g.drawArc(75, 75, 50, 50, 180, 180);
    }
}

// <applet code="Smiley.java" height=500 width=500></applet>