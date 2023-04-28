package class13HW;

public class Task03 {
    public static void main(String[] args) {
        String a = "First";
        String b = "Last";
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
    }
}
