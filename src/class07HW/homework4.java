package class07HW;

public class homework4 {
    public static void main(String[] args) {
        int counter = 20;
        while (counter <= 50) {
            if (counter % 2 != 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();
        for (counter = 20; counter <= 50; counter++) {
            if (counter % 2 != 0) {
                System.out.print(counter + " ");
            }
        }
    }
}