import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = userInput.nextInt();
        userInput.nextLine(); // consume newline character after reading integer
        System.out.println("Enter the sequence of N strings:");
        System.out.println("Reversed sequence: \n" + reverseStringSequence(n, userInput));
    }
    public static String reverseStringSequence(int N, Scanner scanner) {
        if (N <= 0) {
            return "";
        }
        String stringElement = scanner.nextLine();
        return reverseStringSequence(N - 1, scanner) + stringElement + "\n";
    }
}
