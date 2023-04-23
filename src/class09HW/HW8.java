package class09HW;

public class HW8 {
    public static void main(String[] args) {
        // Create an array to store char values and then print those in reverse order
        char[] symbols = {'!', '@', '#', '$', '&', '*', '~', '/'};
        for (int i = symbols.length - 1; i >= 0; i--) {
            System.out.print(symbols[i] + "  ");
        }
    }
}
