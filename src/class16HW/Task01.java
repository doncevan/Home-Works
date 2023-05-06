package class16HW;

public class Task01 {
    /*Create a method that will take a String as a parameter and returns reversed String.
     Method should be available to all classes within your project and accessible by class name.
     */
    static String revString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        return sb.toString();
    }

}
