import java.util.Scanner;
public class SumElemOfArray {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = userInput.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i = 0; i < n;i++) {
            array[i] = userInput.nextInt();
        }
        System.out.println("Enter the number of elements to sum: ");
        int sumNum = userInput.nextInt();
        System.out.println("Sum of " + sumNum + " first array numbers equals to: " + SumArrayElements(array, sumNum));
    }
    public static int SumArrayElements(int[] arr, int n) {
        if (n <= 0 ) {
            return 0;
        }
        else {
            return arr[n-1] + SumArrayElements(arr, n -1);
        }
    }
}
