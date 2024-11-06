import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SimpleDrawApplet extends Applet {

    TextField tfX, tfY, tfWidth, tfHeight;
    Scrollbar hrScrollbar, vrScrollbar;
    Button rectButton;
    int rectX = 50, rectY = 50, rectWidth = 100, rectHeight = 50;
    int ovalX = 150, ovalY = 150, ovalWidth = 100, ovalHeight = 100;

    public void init() {
        setLayout(null);

        tfX = new TextField();
        tfX.setBounds(10, 20, 10, 20);  
        add(tfX);

        tfY = new TextField();
        tfY.setBounds(50, 20, 10, 20);  
        add(tfY);

        tfWidth = new TextField();
        tfWidth.setBounds(90, 20, 10, 20);  
        add(tfWidth);

        tfHeight = new TextField();
        tfHeight.setBounds(130, 20, 10, 20);  
        add(tfHeight);

        hrScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 100, 10, 10, 150);
        hrScrollbar.setBounds(10, 50, 100, 20);  
        add(hrScrollbar);

        vrScrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 100, 10, 10, 150);
        vrScrollbar.setBounds(10, 80, 100, 20);  
        add(vrScrollbar);

        
        rectButton = new Button("Draw Rectangle");
        rectButton.setBounds(10, 110, 100, 30);
        add(rectButton);
        rectButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                rectX = Integer.parseInt(tfX.getText());
                rectY = Integer.parseInt(tfY.getText());
                rectWidth = Integer.parseInt(tfWidth.getText());
                rectHeight = Integer.parseInt(tfHeight.getText());
                repaint();
            }
        });

        hrScrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Update the oval width based on the horizontal scrollbar value
                ovalWidth = hrScrollbar.getValue();
                repaint();  // Repaint the applet to reflect the changes
            }
        });

        vrScrollbar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                // Update the oval height based on the vertical scrollbar value
                ovalHeight = vrScrollbar.getValue();
                repaint();  // Repaint the applet to reflect the changes
            }
        });
        
    }

    
    public void paint(Graphics g) {

        g.setColor(Color.blue);
        g.drawRect(rectX, rectY, rectWidth, rectHeight);

        g.setColor(Color.red);
        g.drawOval(ovalX, ovalY, ovalWidth, ovalHeight);
    }
}



// <applet code="SimpleDrawApplet.class" height=400 width=500></applet>