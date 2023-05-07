package class17HW;

public class FourConstructorsDifferentClass {
    public static void main(String[] args) {


        // FourConstructors obj1 = new FourConstructors("word"); // private is not accessible
        FourConstructors obj2 = new FourConstructors(3); // public is accessible
        FourConstructors obj3 = new FourConstructors(); // default is accessible
        FourConstructors obj4 = new FourConstructors('&'); // protected is accessible
    }
}