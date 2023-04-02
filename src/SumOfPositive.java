import java.util.Scanner;

public class SumOfPositive {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter how many first positive elements to sum: ");
        int n = userInput.nextInt();
        System.out.println("Sum of first " + n + " positive integers: " + SumPositive(n));
    }
    public static int SumPositive(int n) {
        if (n <= 0) {
            return 0;
        }
        else {
            return n + SumPositive(n-1);
        }
    }
}
