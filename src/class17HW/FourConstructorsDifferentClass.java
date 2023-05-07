package class17HW;

public class FourConstructorsDifferentClass {
    public static void main(String[] args) {


        // FourConstructors obj1 = new FourConstructors("word"); // private not accessible
        FourConstructors obj2 = new FourConstructors(3); // public
        FourConstructors obj3 = new FourConstructors(); // default
        FourConstructors obj4 = new FourConstructors('&'); // protected
    }
}