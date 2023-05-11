package class19HW;

/*Create a class in which create a methods that will calculate the area. Method name must
    be called calculateArea. Rectangle, Square*/
public class Task01 {
    public static void main(String[] args) {
        double rectangleArea = AreaCalculator.calculateArea(6, 11);
        System.out.println("Area of rectangle: " + rectangleArea);

        double squareArea = AreaCalculator.calculateArea(7, 7);
        System.out.println("Area of square: " + squareArea);
    }
}

class AreaCalculator {
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}