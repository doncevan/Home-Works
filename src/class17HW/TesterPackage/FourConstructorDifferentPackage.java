package class17HW.TesterPackage;

import class17HW.FourConstructors;

public class FourConstructor {
    public static void main(String[] args) {
        //FourConstructors obj5 = new FourConstructors("word"); // private not accessible
        FourConstructors obj6 = new FourConstructors(3); // public
        //FourConstructors obj7 = new FourConstructors(); // default not accessible
        FourConstructors obj8 = new FourConstructors('&'); // protected
    }
}
