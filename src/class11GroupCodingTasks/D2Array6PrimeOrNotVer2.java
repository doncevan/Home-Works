package class11GroupCodingTasks;

import java.util.Scanner;

public class D2Array6PrimeOrNotVer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number to check(prime or NOT):");
        int number = input.nextInt();

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println("Number " + number + " is NOT a prime");
            } else {
                System.out.println("Number " + number + " is a prime");
                break;
            }
        }
    }
}