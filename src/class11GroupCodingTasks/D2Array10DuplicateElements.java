package class11GroupCodingTasks;

public class D2Array10DuplicateElements {
    public static void main(String[] args) {
        // Write a program to print out duplicate elements from an Array of Strings?

        String[] names = {"Mark", "Ivan", "Alex", "Nelli", "Mark", "Omar", "Alex", "Daniel"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                }
            }
        }
    }
}
