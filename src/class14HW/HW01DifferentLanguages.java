package class14HW;

public class HW01DifferentLanguages {
    // Create a method that will say Hello in different language based on the country that will be passed when method is executed.

    void sayHello(String languages) {
        switch (languages) {
            case "English":
                System.out.println("Hello");
                break;
            case "French":
                System.out.println("Bonjour");
                break;
            case "Russian":
                System.out.println("Privet");
                break;
            case "Turkish":
                System.out.println("Merhaba");
                break;
            case "Romanian":
                System.out.println("Salut");
                break;
            default:
                System.out.println("Language not recognized");
        }
    }

    public static void main(String[] args) {

        HW01DifferentLanguages obj = new HW01DifferentLanguages();
        obj.sayHello("Turkish");
    }
}
