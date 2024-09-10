package SectionOne;
import java.util.Scanner;
public class notasfinalesavanzado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int approved = 0;
        int failed = 0;
        double[][] notas = {
                {1.0, 1.0, 1.0},
                {2.0, 1.0, 50},
                {1.0, 4.2, 3.5},
                {2.0, 3.0, 5.0},
                {3.0, 4.4, 3.2},
                {4.0, 1.0, 10},
                {2.9, 4.1, 3.0},
                {1.0, 5.0, 4.8}
        };

        for (double[] fila : notas) {
            double addition = 0;
            for (double nota : fila) {
                addition += nota;
            }
            double average = addition / fila.length;
            System.out.println("average: " + average);
            if (average >= 6.0) {
                approved++;
            } else {
                failed++;
            }
        }
        System.out.println("The total number of approved: " + approved);
        System.out.println("The total number of disapproved: " + failed);

        scanner.close();
    }
}
