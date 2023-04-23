package class09HW;

public class HW7 {
    public static void main(String[] args) {
        // From an array of integer elements find the largest number.
        int[] numbers = {8, 3, 14, 52, 1, 18};
        int largest = numbers[0];
        for (int i = 1; i <= numbers.length-1; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);/* for(int num:numbers){
                                           if(num>largest){
                                           largest=num;
                                           }
                                           }
                                           System.out.println(largest);*/
    }
}
