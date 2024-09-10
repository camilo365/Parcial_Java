package SectionThree;

import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        int wordCount = 0;

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String newText = text + " ";

        char[] charArray = newText.toCharArray();
        // char[] nuevoArray = new char[text.length() + 1];

        // loop through the char array and print each character
        for (char c : charArray) {
            if (c == ' ') {
                wordCount++;
            }
        }
        System.out.println("The number of words in the text is: " + wordCount);
        scanner.close();
    }
}
