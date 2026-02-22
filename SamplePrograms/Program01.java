import java.util.Scanner;

public class Program01 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        sum(num1, num2);
        scanner.close();
    }
    public static void sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
}
