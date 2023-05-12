package class20HW;

/*Task2
 * Create a class CreditCard and define variable balance and interest. Create an instance method that will
 * calculate interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class override method
 *  calculate interest. Call the method by creating an object of each of the three classes. */
public class CreditCard {
    double balance;
    double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double interestAmount = balance * (interest / 100);
        System.out.println("Your interest balance is: " + interestAmount);
    }
}

class Visa extends CreditCard {

    public Visa(double balance, double interest) {
        super(balance, interest);
    }

}

class AX extends CreditCard {
    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterest() {
        double interestAmount = balance * (interest / 100);
        System.out.println("Your interest balance is: " + interestAmount);
    }
}

class CreditCardTester {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard(10000, 12);
        cc.calculateInterest();

        Visa visa = new Visa(0, 0);
        visa.calculateInterest();

        AX ax = new AX(3000, 19);
        ax.calculateInterest();
    }
}
