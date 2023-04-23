package class06HW;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        /* Ask user to enter a number and then define if number is small, medium or large
            Small number is value between 1 and 10
            Medium number is value between 11 and 100
            Large number is value between 101 and 1000  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1- 1000.");
        int num = scan.nextInt();
        if (num >= 1 && num <= 10) {
            System.out.println("It's a small number.");
        } else if (num >= 11 && num <= 100) {
            System.out.println("It's a medium number.");
        } else if (num >= 101 && num <= 1000) {
            System.out.println("It's a large number.");
        } else {
            System.out.println("Invalid number.");
        }
    }
}
