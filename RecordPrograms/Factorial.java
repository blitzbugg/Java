// 3.	Write a Java Program to print factorial of a given number. If the number is negative then throw a user defined exception.
import java.io.DataInputStream;
public class Factorial {
    
    public static void main(String[] args) {
        try(DataInputStream input = new DataInputStream(System.in)) {
            
            System.out.println("Enter a number: ");
            int number = input.readInt();
            if (number < 0) {
                throw new ArithmeticException("The number is negative");
            }else{
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
                System.out.println("Factorial of " + number + " is " + factorial);
            input.close();
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
