package class09HW;

public class HW5 {
    public static void main(String[] args) {
        /* Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array. */
        String[] animals = {"Dog", "Cow", "Cat", "Lion", "Tiger"};
        for (String animal : animals) {
            System.out.print(animal + "  ");
        }
        System.out.println();
        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i] + "  ");
        }
        System.out.println();
        int i = 0;
        while (i < animals.length) {
            System.out.print(animals[i] + "  ");
            i++;
        }
    }
}
