package SectionOne;
import java.util.Scanner;
public class ContadorVocales4 {
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter a word : ");
            String word = scanner.nextLine();
            int vowels = 0;

            for(int i = 0; i< word.length(); i++){
                char character = word.charAt(i);
                if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                        character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                    vowels++;
                }
            }
            System.out.println("the vowels total in the word is" + word + "son: " + vowels);

        scanner.close();
        }
}
