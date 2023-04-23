package class11GroupCodingTasks;

public class D2Array8MaxMinNum {
    public static void main(String[] args) {
        // Maximum and minimum number in the array.
        int[] numbers = {3, 9, 2, 8, 15, 1};
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}
