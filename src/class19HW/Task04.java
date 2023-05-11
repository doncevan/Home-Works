package class19HW;

/*Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method
with specific arguments and observe result.*/
public class Task04 {
    public static void main(String[] args) {
     /*   OverloadedMethod2.printSum(1, 2);   private methods can't be accessed from outside of class
        OverloadedMethod2.printSum(1, 2, 3);
        OverloadedMethod2.printSum(1.0, 2.0);                                                       */
    }
}

class OverloadedMethod2 {
    private void printSum(int a, int b) {
        System.out.println(a + b);
    }

    private void printSum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    private void printSum(double a, double b) {
        System.out.println(a + b);
    }
}
