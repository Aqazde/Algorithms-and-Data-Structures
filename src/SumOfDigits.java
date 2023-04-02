import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = userInput.nextInt();
        System.out.println("The sum of digits of the number is: " + sumDigits(num));
    }
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}
