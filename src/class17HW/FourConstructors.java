package class17HW;

public class FourConstructors {
    /*   Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,
    default,protected), and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
     3 - from different class inside different package  and observe result.  */
    String str;
    int num;
    char symbol;

    private FourConstructors(String str) {
        this.str = str;
    }

    public FourConstructors(int num) {
        this.num = num;
    }

    FourConstructors() {

    }

    protected FourConstructors(char symbol) {
        this.symbol = symbol;
    }

    public static void main(String[] args) {
        FourConstructors obj1 = new FourConstructors("word");
        FourConstructors obj2 = new FourConstructors(3);
        FourConstructors obj3 = new FourConstructors();
        FourConstructors obj4 = new FourConstructors('&');
    }
}
