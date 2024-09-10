package SectionTwo;
import java.util.Scanner;

class pyramidAsterisks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many levels do you want the pyramid to have?: ");
        int numberRows = sc.nextInt();
        sc.close();

        System.out.println();
        for(int height = 1; height<=numberRows; height++){

            for(int whiteSpaces = 1; whiteSpaces<=numberRows-height; whiteSpaces++){
                System.out.print(" ");
            }

            for(int asterisks=1; asterisks<=(height*2)-1; asterisks++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
