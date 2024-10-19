import java.applet.*;
import java.awt.*;

public class HelloWorldApplet extends Applet {

    public void paint(Graphics g) {

        g.drawString("Hello, World!", 50, 50);
    }
}

// <applet code="HelloWorldApplet.class" width="300" height="200"></applet>