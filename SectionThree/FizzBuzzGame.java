package SectionThree;
import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Range : ");
        int enterNumber = scanner.nextInt();

        for (int i = 1; i <= enterNumber; i++) {
            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
        scanner.close();
    }
}
