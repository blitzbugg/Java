// 6.	Create an interface Shape and a child class Circle. Shape has member function calculateArea() and a constant data member pi(3.14). Write a java program to compute area.
import java.io.DataInputStream;
interface Shape {
    static double pi = 3.14;

    void calculateArea(double radius);
}

public class CircleShape implements Shape {
    double radius;
    
    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of Circle is " + (pi * radius * radius));
    }

    public static void main(String[] args) {
        CircleShape circle = new CircleShape();
        
        try (DataInputStream input = new DataInputStream(System.in)) {
            System.out.println("Enter the radius of the circle");
            circle.radius = Double.parseDouble(input.readLine());
            
            circle.calculateArea(circle.radius);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}