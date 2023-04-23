package class12HW;

import java.util.Scanner;

public class HWTask03 {
    public static void main(String[] args) {
        /*Write a program that reads two people's firstnames and if they're expecting boy or girl?
    Based on the input suggests a name for a baby:   Example Output:
    Mom’s first name? Mary Dad’s first name? Daniel   if boy Suggested baby name: DANRY
    if girl  Suggested baby name: MAIEL */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mom's first name?");
        String momName = scan.next();
        System.out.println("Enter dad's first name?");
        String dadName = scan.next();
        System.out.println("Expecting boy or girl?");
        String gender = scan.next();

        String suggestedBabyName = null;
        if (gender.equals("boy")) {
            suggestedBabyName = dadName.substring(0, 3) + momName.substring(momName.length() - 2);
        } else if (gender.equals("girl")) {
            suggestedBabyName = momName.substring(0, 2) + dadName.substring(dadName.length() - 3);
        }
        System.out.println("Suggested baby name is " + suggestedBabyName.trim().toUpperCase());
    }
}