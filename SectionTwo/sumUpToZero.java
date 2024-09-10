package SectionTwo;
import java.util.Scanner;

class sumUpToZero {

    public static void main(String[] args)
    {

        Scanner teclado = new Scanner( System.in );
        int num,sum;
        sum=0;
        do
        {
            System.out.print("Give me a number: ");
            num=teclado.nextInt();
            sum=sum+num;
        }
        while(num!=0);

        System.out.println("The sum of all the numbers is: "+sum);

        teclado.close();

    }

}

