package class10HW;

public class HWTask6 {
    public static void main(String[] args) {
        /* Create 2D array of countries: north america countries, south america countries, europe countries,
        asian countries,african countries. Then print all values from that array using 2 different loops
        and calculate how many total countries been stored.*/
        String[][] countries = {
                {"USA", "Canada", "Mexico", "Honduras", "Guatemala"},
                {"Brazil", "Peru", "Ecuador", "Argentina", "Chili"},
                {"Spain", "France", "Germany", "Austria", "Poland"},
                {"Japan", "Iran", "South Korea", "Pakistan", "India"},
                {"Algeria", "Libya", "Egypt", "Kenya", "Ethiopia"}
        };
        for (String[] country : countries) {
            for (String all : country) {
                System.out.print(all + " ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------------------------------");


        int sum = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println("Total countries = " + sum);

    }
}
