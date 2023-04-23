package class08HW;

public class HomeWork {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------");
        int i = 1;
        while (i <= 50) {
            if (i % 3 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------");
        for (int a = 1; a <= 50; a++) {
            if (a % 3 == 0) {
                continue;
            }
            System.out.print(a + " ");
        }
    }
}