package SectionOne;
import java.util.Scanner;
public class MCM8 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        // Read input values
        System.out.print("Enter the value 1: ");
        int val1 = scanner.nextInt();
        System.out.print("Enter the value 2: ");
        int val2 = scanner.nextInt();

        int maximunnumber = Math.max(val1, val2);
        int maximun = maximunnumber;

        while (maximun % val1 != 0 || maximun % val2 != 0) {
            maximun += maximunnumber;
        }
        System.out.println("The Least Common Multiple  of " + val1 + " and " + val2 + " is: " + maximun);
    }
}
