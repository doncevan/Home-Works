package class06HW;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        /* Write a program for user to enter his/hers birth month. Based on the month define the season.
            Example: if user is born in March, April, May → season =”Spring”
            if user is born in June, July, August → ; season =”Summer”  etc …
            At the end of the program we should see 1 output as “You were born is season __”.      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your month number please.");
        int month = scan.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("You were born in the Winter.");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("You were born in the Spring.");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("You were born in the Summer.");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("You were born in the Fall.");
        } else {
            System.out.println("Invalid month, enter a number between 1 and 12.");
        }
    }
}
