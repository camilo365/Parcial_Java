package SectionThree;
import java.util.Scanner;

public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size : ");
        int n = scanner.nextInt();
        scanner.close();

        int[][] identityMatrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            identityMatrix[i][i] = 1;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identityMatrix[i][j]);
            }
            System.out.println();
        }
    }
}
