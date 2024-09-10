package SectionThree;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int intNumber; // the number that the user will enter

        do{

            System.out.print("Enter a whole number: ");
            intNumber = scanner.nextInt();

            if(intNumber > randomNumber) {
                System.out.println("The number is greater than the random number.");
            }else if(intNumber < randomNumber) {
                System.out.println("The number is less than the random number");
            }

        }while(intNumber != randomNumber); // if the number is not equal to the random number, the loop will continue

        System.out.println("¡Congratulations! You found the number: " +randomNumber);

        scanner.nextLine();
        scanner.close(); // close sccanner
    }
}

