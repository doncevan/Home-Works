package class13HW;
public class Task01ForMethod {
    public static void main(String[] args) {
        // How would you reverse a String word by word?
        String str = "Java is very challenging";
        String[] arr = str.split(" ");
        for (String rever : arr) {
            for (int i = rever.length() - 1; i >= 0; i--) {
                System.out.print(rever.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
