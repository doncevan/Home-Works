package class10HW;

public class HWTask4 {
    public static void main(String[] args) {
        /* Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers. */
        int[][] numbers = {
                {75, 81, -23},
                {-7, 21, 2},
                {12, 7, 10}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("The sum of all elements is " + sum + ".");
    }
}
