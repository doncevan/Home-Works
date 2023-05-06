package class16HW;

public class Task02 {
    /*Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
   Method should be available inside the class only where it was declared and executed by calling its name
    */
    private static String newString(String a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if (x == 'a' || x == 'o' || x == 'i' || x == 'e' || x == 'u') {
                sb.append(x);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = Task02.newString("Sequoia");
        System.out.println(str);
    }
}
