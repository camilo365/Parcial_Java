package SectionThree;
import java.util.Scanner;

public class CountingDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int number = scanner.nextInt();

        String numberString = String.valueOf(number);
        System.out.println("Numbers of Digits : "+numberString.length());
        
        scanner.close();
    }

}
