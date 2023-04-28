package class13HW;

public class Task01StrBld {
    public static void main(String[] args) {
        // How would you reverse a String word by word?
        String sentence = "Java is very challenging";
        StringBuilder sb = new StringBuilder(sentence);
        String str = sb.reverse().toString();
        String[] reverse = str.split(" ");
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }
    }
}
