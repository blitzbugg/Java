// 4.	Write a Java program to evaluate the expression x/(x-5) where x>5, if the value of x is less than or equal to 5 throw a user defined exception.
import java.io.DataInputStream;

public class ExpressionX {
    public static void main(String[] args) {
      try(DataInputStream input = new DataInputStream(System.in)) {
        
        System.out.println("Enter a number: ");
        int x = input.readInt();
        int exp;
        if (x <= 5) {
            throw new ArithmeticException("You are not allowed to do that");
        } else {
            exp = (x/(x-5));
            System.out.println("The Final expression is: "+ exp);
        }
        
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
        
    }
}
