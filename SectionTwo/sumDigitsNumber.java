import java.util.Scanner;

class sumDigitsNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, addition, digit;


        do {
            System.out.print("Give me a positive integer: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Invalid number");
            }
        } while (n <= 0);

        addition = 0;

        while (n != 0) {
            digit = n % 10;
            addition = addition + digit;
            n = n / 10;
        }

        System.out.println("The sum of the digits of the number is: " + addition);
    }

}
