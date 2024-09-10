package SectionTwo;
import java.util.Scanner;

class averageNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, n;
        double Average, sum, aNumber;
        Average = 0;
        sum = 0;
        System.out.print("How many numbers do you need the average of?: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("Number"  + i +" ");
            System.out.print("Tell me the number: ");
            aNumber = in.nextDouble();
            in.nextLine();
            sum=sum+aNumber;
            System.out.println();
        }
        if (n == 0) {
            Average = 0;
        } else {
            Average=sum/n;
        }
        System.out.println("the average of the numbers is: " + Average);
        System.out.println("the sum of the numbers is: " + sum);
    }

}
