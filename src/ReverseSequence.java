import java.util.Scanner;
public class ReverseSequence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number of elements in sequence: ");
        int n = userInput.nextInt();
        System.out.println("Enter the sequence: ");
        System.out.println("Reversed sequence: " + reverseSequence(n, userInput));
    }
    public static String reverseSequence(int N, Scanner scanner) {
        if (N <= 0) {
            return "";
        }
        int element = scanner.nextInt();
        String remainingReversedSequence = reverseSequence(N - 1, scanner);
        return remainingReversedSequence + element + " ";
    }
}

