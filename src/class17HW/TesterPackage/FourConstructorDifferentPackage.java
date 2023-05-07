package class17HW.TesterPackage;

import class17HW.FourConstructors;

public class FourConstructorDifferentPackage {
    public static void main(String[] args) {
        //FourConstructors obj1 = new FourConstructors("word"); // private not accessible
        FourConstructors obj2 = new FourConstructors(3); // public
        //FourConstructors obj3 = new FourConstructors(); // default not accessible
        FourConstructors obj4 = new FourConstructors('&'); // protected
    }
}
