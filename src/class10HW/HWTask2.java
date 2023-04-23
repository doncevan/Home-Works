package class10HW;

public class HWTask2 {
    public static void main(String[] args) {
        /* Create 2D array of cars : american, german, korean, italian. Then retrieve all values from that array
        using 2 different loops */
        String[][] cars = {

                {"Ford", "Lincoln", "Cadillac", "Chevrolet"},
                {"BMW", "Audi", "Mercedes", "Volkswagen"},
                {"KIA", "Genesis", "Hyundai"},
                {"Ferrari", "Maserati", "Alfa Romeo", "Lamborghini"}
        };

        for (String[] car : cars) {
            for (String item : car) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------");

        for (int i = 0; i < cars[0].length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();

        }

    }
}
