package SectionTwo;
import java.util.Scanner;

class tableMultiply {

    public static void main(String[] args) {

        int number ;
        System.out.println("What table do you want to make?");
        Scanner valor1 = new Scanner(System.in);
        number = valor1.nextInt();

        int multiplier;
        for(multiplier = 1; multiplier <=10; multiplier++){
            System.out.println(number + " X " + multiplier +         " = " + number * multiplier );
        }
    }
}

