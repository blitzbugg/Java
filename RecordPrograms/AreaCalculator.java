// 1.	Write a Java program to find the area of a triangle and rectangle using method overloading.

public class AreaCalculator {

    float breadth,height;
    // Rectangle
    float Area(float breadth, float height){
        this.breadth = breadth;
        this.height = height;
        return breadth * height;
    }
    // Traingle
    float Area(float breadth, float height, int shape){
        this.breadth = breadth;
        this.height = height;
        return (breadth*height)/2;
    }

    public static void main(String[] args) {
        int shape;
        float Area;
        if (args.length < 3) {
            System.out.println("Need 3 Arguments");
            System.out.println("Length, Breadth and shape 1 for Triangle and 0 for Rectangle");
            return;
        }

        float breadth = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);
        shape = Integer.parseInt(args[2]);
        AreaCalculator calculator = new AreaCalculator();

        if (shape == 0) {
           Area = calculator.Area(breadth,height);
           System.out.println("Area of rectangle is: "+Area);
        }
        else if (shape == 1){
            Area = calculator.Area(breadth,height,shape);
            System.out.println("Area of Triangle is: "+Area);
        }
    }
}