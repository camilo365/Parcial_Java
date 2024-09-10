import java.util.Scanner;

public class pares1 {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese el numero: ");
        int number = scanner.nextInt();
        int addition = 0;
        for(int i = 1; i<= number; i++) {
            if(i%2 == 0){
                addition += i;
            }
        }
        System.out.println("the total addittion of the numbers pares is:"+ addition);

        scanner.close();

    }
}
