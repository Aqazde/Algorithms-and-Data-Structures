import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = userInput.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = userInput.nextInt();
        System.out.println("Greatest Common Divisor of two numbers is: " + GCD(firstNum, secondNum));
    }
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }
}
