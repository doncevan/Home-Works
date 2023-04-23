package class06HW;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        /* Write a program that will print whether it is a weekend or weekday.
         If any day from 1-5 → output “It is a weekday”, anyday from 6-7 →
         output “It is a weekend”, any other day → output “Invalid day”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day number from 1 to 7. Number 1 equals to Monday");
        int day = scan.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("It's a weekday.");
        } else if (day > 5 && day < 7) {
            System.out.println("It's a weekend.");
        } else {
            System.out.println("Invalid day.");
        }
    }
}
