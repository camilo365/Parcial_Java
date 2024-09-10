import java.util.Scanner;
public class palindromo9 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word: ");
        String word = scanner.nextLine();
        String invertedword = new StringBuilder(word).reverse().toString();
        if(word.equals(invertedword)) {
            System.out.println("is palindroma");
        }else {
            System.out.println("is not palindroma");
        }

        scanner.close();
    }
}
