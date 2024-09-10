package SectionOne;
import java.util.Scanner;

public class fibonacci6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = scanner.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 2; i < number; i++ ){
            int c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        scanner.close();
    }
}
