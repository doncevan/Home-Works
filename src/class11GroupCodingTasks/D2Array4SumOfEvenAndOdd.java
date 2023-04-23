package class11GroupCodingTasks;

public class D2Array4SumOfEvenAndOdd {
    public static void main(String[] args) {
        /* Create a 2D array of integers. Develop a program which will calculate the sum of even and odd numbers for that array. */
        int[][] numbers = {{1, 2, 4},
                {6, 7, 8},
                {10, 11, 12},
                {13, 14, 15}};
        int sumEven = 0;
        int sumOdd = 0;

        for (int[] number : numbers) {
            for (int i : number) {
                if (i % 2 == 0) {
                    sumEven += i;
                } else {
                    sumOdd += i;
                }
            }
        }

        System.out.println("The sum of even numbers is: " + sumEven);
        System.out.println("The sum of odd numbers is: " + sumOdd);
    }
}
