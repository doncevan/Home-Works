package class10HW;

public class HWTask3 {
    public static void main(String[] args) {
       /* Using 2D array create a grocery list. Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops */
        String[][] grocery = {
                {"Broccoli", "Carrots", "Tomatoes", "Cauliflower", "Carrot"},
                {"Apples", "Bananas", "Mangos", "Grapes", "Kiwi"},
                {"Milk", "Cheese", "Yogurt", "Butter"},
                {"Chocolate", "Ice cream", "Cake", "Candy"}
        };

        for (String[] row : grocery) {
            for (String item : row) {
                System.out.print(item + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");


        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j] + " ");
            }
            System.out.println();
        }

    }
}
