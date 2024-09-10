package SectionOne;
import java.util.Scanner;
public class seriearitmetica10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the terms number: ");
        int n = scanner.nextInt();
        System.out.print("enter the first term: ");
        int a = scanner.nextInt();
        System.out.print("enter the difference : ");
        int d = scanner.nextInt();

        double addition = (n / 2.0) * (2 * a + (n - 1) * d);

        System.out.println("the addition of the first " + n + " terms of the serie is: " + addition);
    }
}
