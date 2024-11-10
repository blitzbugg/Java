interface Shape {
    float PI = 3.14f;
    float calculateArea();
}

class Circle implements Shape {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float calculateArea() {
        return PI * radius * radius;
    }
}

public class CircleArea {
    public static void main(String[] args) {
        float radius = Integer.parseInt(args[0]);
        Circle circle = new Circle(radius); 
        System.out.println("Area of the circle: " + circle.calculateArea());
    }
}
