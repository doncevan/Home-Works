package class11GroupCodingTasks;

import java.util.Scanner;

public class D2Array6PrimeOrNot {
    public static void main(String[] args) {
        /* Write a java program to check whether a given number is prime or not. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        boolean check = true;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        if (check)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");

    }
}
