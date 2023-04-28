package class13HW;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // How would you check if String is palindrome or not? aba=> true; Abbc => false
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String str = inp.nextLine();
        str = str.toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
