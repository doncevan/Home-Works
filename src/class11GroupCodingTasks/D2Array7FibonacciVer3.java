package class11GroupCodingTasks;

public class D2Array7FibonacciVer3 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("First 10 numbers of Fibonacci series:");

        for (int i = 0; i < arr.length; i++) {
            if (i < 2) {
                arr[i] = i;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.print(arr[i] + " ");
        }
    }
}
