import java.util.Scanner;
public class factorial2 {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        int multiplication = 1;

        System.out.println("input the number: ");

        int number = scanner.nextInt();

        for(int i=1;i <= number; i++) {
            multiplication *=i;
        }
        System.out.println("the factorial of the number is:"+ multiplication);
        scanner.close();

    }
}
