// 2.	Write a java program to perform the arithmetic operations using the concept of method overloading.
// a) Get two integers as input and return float value as output.
// b) Get two float value as input and return integer value as 
import java.io.DataInputStream;
import java.io.IOException;

public class ArithmeticOperations {

    float calculate(int a, int b) {
        return (float) (a + b);
    }

    int calculate(float a, float b) {
        return (int) (a - b);
    }

    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(System.in)) {
            ArithmeticOperations operations = new ArithmeticOperations();

            System.out.println("Enter two integers: ");
            int num1 = dis.readInt();
            int num2 = dis.readInt();
            float result1 = operations.calculate(num1, num2);
            System.out.println("Result (sum as float): " + result1);

            System.out.println("Enter two float values: ");
            float num3 = dis.readFloat();
            float num4 = dis.readFloat();
            int result2 = operations.calculate(num3, num4);
            System.out.println("Result (difference as integer): " + result2);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}