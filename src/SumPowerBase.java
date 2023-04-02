import java.util.Scanner;

public class SumPowerBase {
public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter base: ");
    int base = userInput.nextInt();
    System.out.println("Enter powers: ");
    int powers = userInput.nextInt();
    System.out.println("sum of the first "+ powers + " powers of a base " + base + " is: " + PowerBase(base, powers));
}
public static int PowerBase(int b, int n) {
    if (n<0){
        return 0;
    }
    else {
        return (int) (Math.pow(b, n) + PowerBase(b, n - 1));
    }
}
}
