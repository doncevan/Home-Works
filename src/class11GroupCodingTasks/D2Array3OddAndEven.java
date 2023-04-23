package class11GroupCodingTasks;

public class D2Array3OddAndEven {
    public static void main(String[] args) {
        /* Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only. */
        int[][] values = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        System.out.print("The even numbers are: ");
        for (int[] value : values) {
            for (int i : value) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}