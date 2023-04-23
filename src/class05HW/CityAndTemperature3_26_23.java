package class05HW;

import java.util.Scanner;

public class CityAndTemperature3_26_23 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your city?");
        String city= scanner.nextLine();
        System.out.println("What is the temperature today?");
        int temp= scanner.nextInt();
            temp=(temp-32)*5/9;
        System.out.println("The temperature in "+city+" is "+temp+" celsius today.");

    }
}
