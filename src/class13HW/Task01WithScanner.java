package class13HW;

import java.util.Scanner;

public class Task01WithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence");
        String originalStr = scanner.nextLine();
        String words[] = originalStr.split("\\s");
        String reversedString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.print("Reversed string : " + reversedString);
    }
}
