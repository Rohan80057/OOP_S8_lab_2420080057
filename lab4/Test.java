package lab4;
import mypackage.Calculator; 
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.sub(num1, num2));
        sc.close();
    }
}
