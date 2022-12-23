package labexercise;

// Constructor overloading
public class Overloading { 
//instance variables of the class 
int id; 
String name; 
 
Overloading(){ 
System.out.println("this a default constructor"); 
} 
 
Overloading(int i, String n){ 
id = i; 
name = n; 
} 
 
public static void main(String[] args) { 
//object creation 
Student s = new Student(); 
System.out.println("\nDefault Constructor values: \n"); 
System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name); 
 
System.out.println("\nParameterized Constructor values: \n"); 
Student student = new Student(); 
System.out.println("Student Id : "+student.id + "\nStudent Name : "
"+student.name); "
} 
} 
// Method Overloading: changing no. of arguments
class Adder{ 
static int add(int a,int b){return a+b;} 
static int add(int a,int b,int c){return a+b+c;} 
} 
class TestOverloading1{ 
public static void main(String[] args){ 
System.out.println(Adder.add(11,11)); 
System.out.println(Adder.add(11,11,11)); 
}} 
class MethodOverloading {
 private static void display(int a){
 System.out.println("Arguments: " + a);
 }
OOP PROGRAMMING WITH JAVA LABORATORY [21CSL35]
SJCIT, Chickballapur 27 2022-23
 private static void display(int a, int b){
 System.out.println("Arguments: " + a + " and " + b);
 }
 public static void main(String[] args) {
 display(1);
 display(1, 4);
 }
}
//Method Overloading: changing data type of arguments
class Adder{ 
static int add(int a, int b){return a+b;} 
static double add(double a, double b){return a+b;} 
} 
class TestOverloading2{ 
public static void main(String[] args){ 
System.out.println(Adder.add(11,11)); 
System.out.println(Adder.add(12.3,12.6)); 
}} 
class MethodOverloading {
 // this method accepts int
 private static void display(int a){
 System.out.println("Got Integer data.");
 }
 // this method accepts String object
 private static void display(String a){
 System.out.println("Got String object.");
 }
 public static void main(String[] args) {
 display(1);
 display("Hello");
 }
}
