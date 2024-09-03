package OOPsBasics;

class Student {

    String name;
    int age;

    // Method to print the name
    public void printInfo(String name) {
        System.out.println(name);
    }

    // Method to print the age
    public void printInfo(int age) {
        System.out.println(age);
    }

    // Method to print both age and name
    public void printInfo(int age, String name) {
        System.out.println(age + " " + name);
    }
}

public class Polymorphism {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.age = 21;
        s1.name = "vinod";

        // Correctly calling the overloaded method to print both age and name
        s1.printInfo(s1.age, s1.name);
    }
}
