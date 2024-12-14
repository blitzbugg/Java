import java.util.Scanner;

public class ArithmeticOperations {

    float calculate(int a, int b) {
        return (float) (a + b);
    }

    int calculate(float a, float b) {
        return (int) (a - b);
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            ArithmeticOperations operations = new ArithmeticOperations();

            System.out.print("Enter two integers: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            float result1 = operations.calculate(num1, num2);
            System.out.println("Result (sum as float): " + result1);

            System.out.print("Enter two float values: ");
            float num3 = scanner.nextFloat();
            float num4 = scanner.nextFloat();
            int result2 = operations.calculate(num3, num4);
            System.out.println("Result (difference as integer): " + result2);
            scanner.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
