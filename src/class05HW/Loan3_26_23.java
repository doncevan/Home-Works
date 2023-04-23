package class05HW;

import java.util.Scanner;

public class Loan3_26_23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How much would you like to borrow?");
        int loan= scanner.nextInt();
        if(loan<=200000){
            System.out.println("Congratulations, your loan is approved!");
        }else{
            System.out.println("Unfortunately, your loan is denied.");
        }
    }
}
