package class10HW;

public class HWTask1 {
    public static void main(String[] args) {
        /* Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
         Then your program should print name of the students that has A and B grade */
        String[][] bestStudents = {
                {"Mark", "Elena", "Jose", "Emma"},
                {"A", "B", "C", "D"}
        };

        for (int i = 0; i < bestStudents[1].length; i++) {
            if (bestStudents[1][i].equals("A") || bestStudents[1][i].equals("B"))
                System.out.println(bestStudents[0][i] + " " + bestStudents[1][i]);
        }
        System.out.println();
    }
}
