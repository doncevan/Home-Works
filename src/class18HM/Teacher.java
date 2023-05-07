package class18HM;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
    String name;
    String subject;
    int age;


    void bio() {
        System.out.println(name + " is " + age + " years old and he/she teaches " + subject + ".");
    }


    void board() {
        System.out.println("Teacher explains the subject on whiteboard. ");
    }

    void lab() {
        System.out.println("All students enjoy using lab.");
    }

    void music() {
        System.out.println("Everyone in this school loves music!");
    }

}

class MathTeacher extends Teacher {

}

class ChemistryTeacher extends Teacher {

}

class PianoTeacher extends Teacher {

}

class TeacherTester {
    public static void main(String[] args) {
        Teacher T = new Teacher();
        T.name = "Fred";
        T.age = 35;
        T.subject = "substitute";
        T.bio();
        System.out.println("---------------------------------------------------------------");

        MathTeacher MT = new MathTeacher();
        MT.name = "Bill";
        MT.age = 40;
        MT.subject = "Math";
        MT.bio();
        MT.board();

        System.out.println("---------------------------------------------------------------");
        ChemistryTeacher CT = new ChemistryTeacher();
        CT.name = "Lesly";
        CT.age = 27;
        CT.subject = "Chemistry";
        CT.bio();
        CT.lab();

        System.out.println("---------------------------------------------------------------");
        PianoTeacher PT = new PianoTeacher();
        PT.name = "John";
        PT.age = 50;
        PT.subject = "Piano";
        PT.bio();
        PT.music();
    }
}
