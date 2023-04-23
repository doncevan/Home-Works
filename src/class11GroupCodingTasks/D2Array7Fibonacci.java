package class11GroupCodingTasks;

public class D2Array7Fibonacci {
    public static void main(String[] args) {
        /* Write a Java Program to print the first 10 numbers of Fibonacci series. */
        int a = 10, n1 = 0, n2 = 1;
        System.out.print("First " + a + " numbers of Fibonacci sequence are: ");
        for (int i = 1; i <= a; ++i) {
            System.out.print(n1 + " + ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
