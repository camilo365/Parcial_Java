import java.util.Scanner;
import java.lang.Math;

class ArmstrongNumber
{

    static boolean isArmstrong(int n)
    {
        int temp, digits = 0, last = 0, sum = 0;

        temp = n;


        while(temp > 0)
        {
            temp = temp / 10;
            digits++;
        }

        temp = n;


        while(temp > 0)
        {
            last = temp % 10;
            sum += Math.pow(last, digits);
            temp = temp / 10;
        }


        return n == sum;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = sc.nextInt();


        if(isArmstrong(num))
        {
            System.out.println(num + " Is a Armstrong number.");
        }
        else
        {
            System.out.println(num + " It is not a Armstrong number.");
        }

        sc.close();
    }
}

