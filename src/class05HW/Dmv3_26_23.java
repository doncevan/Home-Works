package class05HW;

import java.util.Scanner;

public class Dmv3_26_23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, enter your age.");
        int age= scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligible for driver license.");
        }else{
            System.out.println("You can get only a learner permit now.");
        }

    }
}
