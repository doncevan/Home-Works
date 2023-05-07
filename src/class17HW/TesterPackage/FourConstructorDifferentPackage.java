package class17HW.TesterPackage;

import class17HW.FourConstructors;

public class FourConstructorDifferentPackage {
    public static void main(String[] args) {
        //FourConstructors obj1 = new FourConstructors("word"); // private is not accessible
        FourConstructors obj2 = new FourConstructors(3); // public is accessible
        //FourConstructors obj3 = new FourConstructors(); // default is not accessible
        FourConstructors obj4 = new FourConstructors('&'); // protected is accessible with different output
    }
}
