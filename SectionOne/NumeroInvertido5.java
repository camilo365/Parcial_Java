package SectionOne;
import java.util.Scanner;
public class NumeroInvertido5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter digit: ");
        int digit = scanner.nextInt();
        String numberStr = Integer.toString(digit);

        String invertednumber = new StringBuilder(numberStr).reverse().toString();
        System.out.print("this is your digit:" + numberStr);
        System.out.print("this is your inverted digit :" + invertednumber);

    scanner.close();
    }
}
