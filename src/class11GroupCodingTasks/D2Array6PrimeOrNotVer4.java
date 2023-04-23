package class11GroupCodingTasks;

import java.util.Scanner;

public class D2Array6PrimeOrNotVer4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int input = scan.nextInt();

        for (int i = 2; i <= 32767; i++) {
            if (input % i == 0 && input != i) {
                System.out.println(input + " is not a Prime number");
                break;
            } else if (i == 32767) {
                System.out.println(input + " is a Prime number");
            }
        }
    }
}
