import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input positive number: ");
        int n = userInput.nextInt();
        System.out.println(n+ "'th Fibonacci sequence equal to: " + Fibonacci(n));
    }
    public static int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
