package class06HW;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        //  Ask user to enter their country and capture it. Once values are captured print which language user speaks.
        Scanner scan = new Scanner(System.in);
        System.out.println("Where are you from?");
        String country = scan.nextLine();
        switch (country) {
            case ("USA"):
                System.out.println("You speak English");
                break;
            case ("Germany"):
                System.out.println("You speak German");
                break;
            case ("Itali"):
                System.out.println("You speak Italian");
                break;
            case ("Russia"):
                System.out.println("You speak Russian");
                break;
            case ("China"):
                System.out.println("You speak Chinese");
                break;
            default:
                System.out.println("You speak ...");
        }
    }
}
