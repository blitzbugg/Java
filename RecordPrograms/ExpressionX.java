import java.util.Scanner;

public class ExpressionX {
    public static void main(String[] args) {
      try(Scanner scanner = new Scanner(System.in);) {
        
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        int exp;
        if (x <= 5) {
            throw new ArithmeticException("You are not allowed to do that");
        } else {
            exp = (x/(x-5));
            System.out.println("The Final expression is: "+ exp);
        }
        
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
      }
        
    }
}
