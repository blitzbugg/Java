import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class SumApplet extends Applet implements ActionListener {
    TextField num1, num2, result;
    Button calculate;

    public void init() {
        // Initialize components
        Label label1 = new Label("Number 1:");
        Label label2 = new Label("Number 2:");
        Label labelResult = new Label("Result:");

        num1 = new TextField(10);
        num2 = new TextField(10);
        result = new TextField(10);

        calculate = new Button("Calculate");
        calculate.addActionListener(this);

        add(label1);
        add(num1);
        add(label2);
        add(num2);
        add(calculate);
        add(labelResult);
        add(result);
    }

    public void actionPerformed(ActionEvent e) {
        
        try {
            int number1 = Integer.parseInt(num1.getText());
            int number2 = Integer.parseInt(num2.getText());
            int sum = number1 + number2;
            result.setText(String.valueOf(sum)); 
        } catch (NumberFormatException ex) {
            result.setText("Invalid input");
        }
    }
}

// <applet code="SumApplet.class" height=500 width=500></applet>