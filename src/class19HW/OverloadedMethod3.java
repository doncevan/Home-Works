package class19HW;

// This is working solution for Task04. In it, we access private methods within class.
public class OverloadedMethod3 {
    private void printSum(int a, int b) {
        System.out.println(a + b);
    }

    private void printSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    private void printSum(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        OverloadedMethod3 OM = new OverloadedMethod3();
        OM.printSum(1, 2);
        OM.printSum(1, 2, 3);
        OM.printSum(2.0, 3.0);
    }
}
