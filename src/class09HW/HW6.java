package class09HW;

public class HW6 {
    public static void main(String[] args) {
        /* Create an array on integers and calculate the sum of all elements in an array  */
        int[] numbers = {26, 38, 54, 3, 9, 108, -75};
        System.out.println(numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6]);

        System.out.println("----------------------------");

        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }
}

