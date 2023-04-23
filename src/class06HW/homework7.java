package class06HW;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        /*Allow user to enter grade (A, B, or C etc...) and then provide explanation:
        A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
        At the end your program should print which grade was entered by a user with explanation.  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade: A,B,C or D.");
        String grade = scan.nextLine();
        switch (grade) {
            case ("A"):
                System.out.println("Your grade is Excellent");
                break;
            case ("B"):
                System.out.println("Your grade is Good");
                break;
            case ("C"):
                System.out.println("Your grade is Average");
                break;
            case ("D"):
                System.out.println("Your grade is Bad");
                break;
            default:
                System.out.println("Your grade is not acceptable");
                break;
        }
    }
}
