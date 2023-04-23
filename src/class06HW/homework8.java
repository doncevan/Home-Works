package class06HW;

import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        /*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user. Use if statement.   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        double num1 = scan.nextDouble();
        System.out.println("Please enter an another number.");
        double num2 = scan.nextDouble();
        System.out.println("Please enter an arithmetical operator.");
        char operator = scan.next().charAt(0);

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        if (operator == '+') {
            System.out.println("The answer is " + sum);
        } else if (operator == '-') {
            System.out.println("The answer is " + sub);
        } else if (operator == '*') {
            System.out.println("The answer is " + mult);
        } else if (operator == '/') {
            System.out.println("The answer is " + div);
        } else {
            System.out.println("Invalid entry");
        }


    }
}
