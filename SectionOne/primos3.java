package SectionOne;
import java.util.Scanner;
public class primos3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input the number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for(int num = 2; num <= (int)Math.sqrt(number); num++){
            if(number % num == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + "it is a prime number");
        }else{
            System.out.println(number + "it is not a prime number");
        }

        System.out.println("number entered" + number);

        scanner.close();
    }
}
