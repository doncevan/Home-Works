package class06HW;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        /* Write a program that will read three inputs of scores (quiz, midterms, and final scores)
           and determine the grade based on the following rules:
            if the average score >=90 → grade=A
            if the average score >= 70 and <90 → grade=B
            if the average score>=50 and <70 → grade=C
            if the average score<50 → grade=F        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your quiz score.");
        int quizScore = scan.nextInt();
        System.out.println("Please enter your midterms score.");
        int midtermsScore = scan.nextInt();
        System.out.println("Please enter your final score.");
        int finalScore = scan.nextInt();
        int averageScore = ((quizScore + midtermsScore + finalScore) / 3);
        if (averageScore >= 90) {
            System.out.println("Your grade is A.");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("Your grade is B.");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("Your grade is C.");
        } else if (averageScore < 50) {
            System.out.println("Your grade is F.");
        }
    }
}
