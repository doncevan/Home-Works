package class12HW;

public class HWTask01 {
    public static void main(String[] args) {
        /*Create a String and if the String is not empty perform the following: if the String has an odd number of characters
         and has 3 or more characters, print the character in the middle of the String. */
        String word = "Renaissance";
        if (!word.isBlank() && word.length() % 2 == 1 && word.length() >= 3) {
            int middleIndex=word.length()/2;
            char middleChar=word.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
