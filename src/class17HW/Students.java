package class17HW;

public class Students {
    /* Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks.
     Your program should print an average mark of each student's name.
     */
    String name;
    int geometryGrade;
    int chemistryGrade;
    int biologyGrade;

    Students(String name, int geometryGrade, int chemistryGrade, int biologyGrade) {
        this.name = name;
        this.geometryGrade = geometryGrade;
        this.chemistryGrade = chemistryGrade;
        this.biologyGrade = biologyGrade;

    }

    void printAverageMark() {
        int sumOfGrades = geometryGrade + chemistryGrade + biologyGrade;
        double average = sumOfGrades / 3;
        System.out.println(average);

    }
}
