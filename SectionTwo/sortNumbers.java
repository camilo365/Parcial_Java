import java.util.Scanner;

class sortNumbers {

    int a, b, c;

    Scanner entrada = new Scanner(System.in);

    public void enterNumbers() {
        System.out.println("Give me three numbers");
        System.out.print("Number 1: ");
        a = entrada.nextInt();
        System.out.print("Number 2: ");
        b = entrada.nextInt();
        System.out.print("Number 3: ");
        c = entrada.nextInt();
    }

    public void order() {
        int min, mid, max;


        if (a <= b && a <= c) {
            min = a;
            if (b <= c) {
                mid = b;
                max = c;
            } else {
                mid = c;
                max = b;
            }
        } else if (b <= a && b <= c) {
            min = b;
            if (a <= c) {
                mid = a;
                max = c;
            } else {
                mid = c;
                max = a;
            }
        } else {
            min = c;
            if (a <= b) {
                mid = a;
                max = b;
            } else {
                mid = b;
                max = a;
            }
        }

        System.out.println("Your numbers from lowest to highest: " + min + " " + mid + " " + max);
    }

    public static void main(String[] args) {
        sortNumbers fc = new sortNumbers();
        fc.enterNumbers();
        fc.order();
    }
}

