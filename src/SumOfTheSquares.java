import java.util.Scanner;
public class SumOfTheSquares {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input positive number: ");
        int n = userInput.nextInt();
        System.out.println("Sum of squares of " + n + " is: " + SumOfSquares(n));
    }
    public static int SumOfSquares(int n) {
        if (n<=0) {
            return 0;
        }
        else {
            return n * n + SumOfSquares(n-1);
        }
    }
}
