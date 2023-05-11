package class19HW;

/*Create class with a static method that has 3 overloaded forms. Then call each overloaded method
with specific arguments and observe result. */
public class Task03 {
    public static void main(String[] args) {
        OverloadedMethod.printSum(1, 2);
        OverloadedMethod.printSum(1, 2, 3);
        OverloadedMethod.printSum(1.0, 2.0);
    }
}

class OverloadedMethod {
    static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    static void printSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void printSum(double a, double b) {
        System.out.println(a + b);
    }
}