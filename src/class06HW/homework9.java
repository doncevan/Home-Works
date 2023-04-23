package class06HW;

import java.util.Scanner;

public class homework9 {
    public static void main(String[] args) {
        /*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
     Based on operator provide the result to user. Use switch case.   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number.");
        double num1 = scan.nextDouble();
        System.out.println("Please enter an another number.");
        double num2 = scan.nextDouble();
        System.out.println("Please enter an arithmetical operator.");
        char operator = scan.next().charAt(0);

        double answer;
        switch (operator) {
            case '+':
                answer = num1 + num2;
                System.out.println("The answer is " + answer);
                break;
            case '-':
                answer = num1 - num2;
                System.out.println("The answer is " + answer);
                break;
            case '*':
                answer = num1 * num2;
                System.out.println("The answer is " + answer);
                break;
            case '/':
                answer = num1 / num2;
                System.out.println("The answer is " + answer);
                break;
        }

    }
}

