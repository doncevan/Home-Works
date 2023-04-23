package class11GroupCodingTasks;

public class D2Array9SecondLargest {
    public static void main(String[] args) {
        //Write a java program to find the second-secondLargest number in the array.
        int[] numbers = {3, 17, 54, 6, 8, 111, -46, 110};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }
        System.out.println("The second largest number is: " + secondLargest);
    }
}
