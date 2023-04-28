package class13HW;

public class Task02ForAndIfElse {
    public static void main(String[] args) {
        String str = "Madam";
        String str2 = "";
        str = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
        if (str2.equals(str)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
