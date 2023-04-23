package class11GroupCodingTasks;

public class D2Array1HighestAndLowestTemperature {
    public static void main(String[] args) {
        /*  Create a program that uses an array to store a list of temperatures for a week, and then uses a loop to find
            the highest and lowest temperature for the week.  */
        int[] temperatures = {56, 84, 39, 95, 49, 25, 77};
        int highestTemperature = temperatures[0];
        int lowestTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }
            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }

        System.out.println("The highest temperature for the week is: " + highestTemperature);
        System.out.println("The lowest temperature for the week is: " + lowestTemperature);
    }
}
