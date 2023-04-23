package class06HW;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        /* Write a program that will ask user to input their current time (use 24 hour format).
            Based on the given time define:
            if hour is between 1-11 --> Morning
            if hour between 12-15 --> Afternoon
            if hour between 16-20 --> Evening
            if hour between 21-24 --> Night       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your current time in 24 hours format.");
        int time = scan.nextInt();
        if (time >= 01 && time <= 11) {
            System.out.println("It's  a Morning.");
        } else if (time >= 12 && time <= 15) {
            System.out.println("It's an Afternoon. ");
        } else if (time >= 16 && time <= 20) {
            System.out.println("It's an Evening.");
        } else if (time >= 21 && time <= 24) {
            System.out.println("It's a Night.");
        } else {
            System.out.println("Invalid time.");
        }
    }
}
