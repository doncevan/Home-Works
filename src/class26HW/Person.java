package class26HW;

import java.util.Map;
import java.util.TreeMap;

/*
    Create a Person class with following private fields: name, lastName, age, salary. Variables should be initialized
    through constructor. Inside the class also create a method to print user details.
    In Test Class create a Map that will store keys in ascending order. In that map store personId and a Person Object.
    Print each object details.
    */
public class Person {
    private final String name;
    private final String lastName;
    private final int age;
    private final double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);
    }
}

class TestClass {
    public static void main(String[] args) {
        Map<Integer, Person> map = new TreeMap<>();
        map.put(1, new Person("John", "Doe", 25, 35000));
        map.put(2, new Person("Mike", "Brown", 40, 60000));
        map.put(3, new Person("Tommy", "Cane", 35, 46000));
        map.put(4, new Person("Mary", "Poppins", 50, 68000));
        map.put(5, new Person("Anna", "Wolf", 22, 26000));

        for (var obj : map.entrySet()) {
            System.out.print("Person ID:" + obj.getKey() + " ");
            obj.getValue().printDetails();
        }
    }
}

