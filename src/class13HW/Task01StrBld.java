package class13HW;

public class Task01 {
    public static void main(String[] args) {
        // How would you reverse a String word by word?
        String sentence = "Java is very challenging";
        StringBuilder sb = new StringBuilder(sentence);
        sb.reverse();
        sentence = sb.toString();
        String[] newConvert = sentence.split(" ");
        for (int i = newConvert.length - 1; i >= 0; i--) {
            System.out.print(newConvert[i] + " ");
        }
    }
}
