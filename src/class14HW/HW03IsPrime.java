package class14HW;

public class HW03IsPrime {
    // Write a method to return whether given number is prime or not?

    boolean isPrime(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) {
                prime = false;
                break;
            } else if (i == number) {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        HW03IsPrime obj = new HW03IsPrime();
        System.out.println(obj.isPrime(22));
    }
}
