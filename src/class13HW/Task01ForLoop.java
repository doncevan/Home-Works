package class13HW;
public class Task01ForLoop {
    public static void main(String[] args) {
        // How would you reverse a String word by word?
        String sentence = "Java is very challenging";
        String[] arr = sentence.split(" ");
        for (String reverse : arr) {
            for (int i = reverse.length() - 1; i >= 0; i--) {
                System.out.print(reverse.charAt(i));
            }
            System.out.print(" ");
        }
    }
}
