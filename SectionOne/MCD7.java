package SectionOne;
import java.util.Scanner;

public class MCD7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the value 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Enter the value 2: ");
        int val2 = scanner.nextInt();
        int min = Math.min(val1, val2);
        int counter = 0;
        for (int i = 1; i <= min; i++) {
            if (val1 % i == 0 && val2 % i == 0) {
                counter++;
                System.out.println(i + " is a common divisor");
            }
        }
        System.out.println("Total number of common divisors: " + counter);
    }
}
