package class11GroupCodingTasks;

public class D2Array5SwapTwoNums {
    public static void main(String[] args) {
        /*  Write a program to swap 2 numbers without a temporary variable. */
        int a = 3;
        int b = 9;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
