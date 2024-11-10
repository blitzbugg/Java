// Print an actual star using java apple
import java.awt.*;
import java.applet.*;

public class Star extends Applet{

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(50, 50, 250, 150);
        g.drawLine(250, 150, 50, 200);
        g.drawLine(50, 200, 168, 45);
        g.drawLine(168, 45, 168, 250);
        g.drawLine(168, 250, 50, 50);
    }
}
// <applet code="Star.class" width=500 height=500></applet>