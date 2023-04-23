package class09HW;

public class HW2 {
    public static void main(String[] args) {
        /* Create an array of names and store all names of your group. Then print your name from that array.
        (use 2 different ways of creating an array). */
        String[] names={"Asgar", "Boris", "Elena", "Isaac", "Ivan", "Mark", "Semir"};
        System.out.println(names[4]);
                System.out.println("-----------");

        String[] names2= new String[7];
        names2[0]="Asgar";
        names2[1]="Boris";
        names2[2]="Elena";
        names2[3]="Isaac";
        names2[4]="Ivan";
        names2[5]="Mark";
        names2[6]="Semir";
        System.out.println(names2[4]);
    }
}
