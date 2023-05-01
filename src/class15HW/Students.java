package class15HW;

public class Students {
    /* Create a Class called Students. Create three  variables: Name , ID  and  numberOfStudents
    Create three objects of the Students Class. Set the value for  studentName , studentID and increment
     the numberOfStudents for each object. Print out  total number of students.  */
    String Name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students firstStudent = new Students();
        firstStudent.Name = "Daniel";
        firstStudent.ID = "abc123";
        numberOfStudents++;

        Students secondStudent = new Students();
        secondStudent.Name = "Nelli";
        secondStudent.ID = "def456";
        numberOfStudents++;

        Students thirdStudent = new Students();
        thirdStudent.Name = "Mark";
        thirdStudent.ID = "ghi789";
        numberOfStudents++;

        System.out.print("Total number of sudents: " + numberOfStudents);
    }
}

