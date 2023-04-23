package class11GroupCodingTasks;

public class D2Array2SumOfElements {
    public static void main(String[] args) {
        /*  Create an array of integer values. After the array is created, calculate the sum of all stored elements in that array. */
        int[] values = {8, 4, 9, 11, 25, 6, 33};
        int sum = 0;

        for (int value : values) {
            sum += value;
        }
        System.out.println("The sum is: " + sum);
    }
}
