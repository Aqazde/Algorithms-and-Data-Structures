import java.util.Scanner;

public class MaxValueinArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = userInput.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n;i++) {
            array[i] = userInput.nextInt();
        }
        System.out.println("Maximum value is: " + MaxValue(array, 0, array.length - 1));
    }
    public static int MaxValue(int[] array, int start, int end) {
        if (start == end) {
            return array[end];
        }
        else {
            int middle = (start + end) / 2;
            int right = MaxValue(array, middle + 1, end);
            int left = MaxValue(array, start, middle);
            return Math.max(left,right);
        }
    }
}
