package class11GroupCodingTasks;

public class D2Array8MaxMinNumVer2 {
    public static void main(String[] args) {
        int[] numbers = {-183, 9, 182, -8, 115, 116};
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}