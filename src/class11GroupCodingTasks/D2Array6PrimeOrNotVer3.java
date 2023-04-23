package class11GroupCodingTasks;

public class D2Array6PrimeOrNotVer3 {
    public static void main(String[] args) {
        int num = 11;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("It is a Prime number ");
        } else {
            System.out.println("It is not a prime number ");
        }
    }
}
