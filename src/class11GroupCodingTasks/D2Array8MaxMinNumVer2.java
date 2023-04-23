package class11GroupCodingTasks;

public class D2Array8MaxMinNumVer2 {
    public static void main(String[] args) {
        int[] numbers = {83, 9, 2, -8, 115, -110};
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            for (int i : numbers) {
                if (number > max) {
                    max = number;
                } else if (i < min) {
                    min = i;
                }
            }
        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}