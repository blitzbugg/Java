// 5.	Create an abstract class called Figure which contains three data members ( length, breadth and height). Include an abstract method to find the area . Figure class also contains concrete methods to read the data members and to display them. Derive two classes Rectangle and Triangle from Figure and override area() to find the area of a rectangle and triangle. 
import java.io.DataInputStream;

abstract class Figure {
    float length, breadth, height;

    void readData(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    void displayData() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height: " + height);
    }

    abstract float area();
}

class Rectangle extends Figure {
    @Override
    float area() {
        return length * breadth;
    }
}

class Triangle extends Figure {
    @Override
    float area() {
        return 0.5f * breadth * height;
    }
}

public class FigureMain {
    public static void main(String[] args) {
        System.out.println("Enter the values for length, breadth, and height:");

        try (DataInputStream input = new DataInputStream(System.in)) {

            float length = Float.parseFloat(input.readLine());
            float breadth = Float.parseFloat(input.readLine());
            float height = Float.parseFloat(input.readLine());

            Rectangle rectangle = new Rectangle();
            rectangle.readData(length, breadth, 0);
            rectangle.displayData();
            System.out.println("Area of Rectangle: " + rectangle.area());

            Triangle triangle = new Triangle();
            triangle.readData(length, breadth, height);
            triangle.displayData();
            System.out.println("Area of Triangle: " + triangle.area());

        } catch (Exception e) {
            System.out.println("Error occurred while reading input: " + e.getMessage());
        }
    }
}
