package SectionThree;
import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //boolean isMagicNumber = false;

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int firstNumber = number;
        scanner.close();

        // Calculate the sum of digits of the number
        int sumOfDigits; 

        do{

            sumOfDigits = calculateSumOfDigits(number);

            if(sumOfDigits == 1) {
                //isMagicNumber = true;
                System.out.println(firstNumber + " Is a magic number");
                break;
            }

            else if (String.valueOf(sumOfDigits).length() == 1) {
                System.out.println(firstNumber + " Isn´t a magic number");
                break;
            }
            
            else{
                number = sumOfDigits;
            }

        // Calculate the sum of digits  until it becomes a single digit
        }while(true);
        //{while(!sumOfDigits);

    }

    public static int calculateSumOfDigits(int number) {
        String numberString = String.valueOf(number);

        char[] digits = numberString.toCharArray();

        int sum = 0;

        for(char c : digits){
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}
