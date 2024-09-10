import java.util.Scanner;

class numberPerfect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        do {

            System.out.println("Write a number");
            number = sc.nextInt();

            if (!(number >= 0)) {
                System.out.println("You must write a number greater than zero");
            }

        } while (!(number >= 0));

        int addition = 0;

        for (int i = 1; i <= number / 2; i++) {

            if (number % i == 0) {
                addition += i;
            }

        }

        if (number == addition) {
            System.out.println("It is a perfect number");
        } else {
            System.out.println("It is not a perfect number");
        }

    }
}


