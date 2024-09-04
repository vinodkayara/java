package OOPsBasics;

abstract class  Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a new Animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String rgs[]){
        Horse horse = new Horse();
        horse.walk();
    }
}
