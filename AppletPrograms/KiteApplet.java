import java.applet.Applet;
import java.awt.*;

public class KiteApplet extends Applet {

    
    public void paint(Graphics g) {
        setBackground(Color.cyan);

        int[] xPoints = {100, 150, 100, 50};
        int[] yPoints = {50, 150, 250, 150};

        g.setColor(Color.yellow);
        g.fillPolygon(xPoints, yPoints, 4);

        g.setColor(Color.black);
        g.drawPolygon(xPoints, yPoints, 4);

        g.drawLine(100, 250, 100, 350);

    }
}

// <applet code="KiteApplet.class" height=500 width=500></applet>