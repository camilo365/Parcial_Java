import java.util.Scanner;

class degrees {

    public static void main (String[] args){
        Scanner degrees = new Scanner(System.in);
        double degreesC, degreesF;
        System.out.println("enter degrees celsius: ");
        degreesC = degrees.nextDouble();
        degreesF = (degreesC * 9/5) + 32;
        System.out.println( degreesC + " Degrees Celsius is equal to " + degreesF + " Degrees Farenheit");
    }

}
