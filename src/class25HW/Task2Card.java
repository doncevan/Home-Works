package class25HW;

import java.util.LinkedList;

    /*
    Create a Card class that will have interest rate field and card type
    and a constructor that will initialize the fields.
    Create 3 objects of different card and store them into LinkedList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
    */
public class Task2Card {
    Double interestRate;
    String cardType;

    public Task2Card(Double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    void display() {
        System.out.println("You can get " + cardType + " card with interest rate of: " + interestRate);
    }
}

class CardTester {
    public static void main(String[] args) {
        LinkedList<Task2Card> cards = new LinkedList<>();
        cards.add(new Task2Card(15.99, "American Express"));
        cards.add(new Task2Card(13.99, " Visa"));
        cards.add(new Task2Card(18.99, "Citi"));
        for (Task2Card c : cards) {
            c.display();
        }
    }
}
