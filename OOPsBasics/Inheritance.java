package OOPsBasics;

class Shape{
    public void area(){
        System.out.println("display area");
    }

}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class EquliateralTriangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}


public class Inheritance {
    public static void main(String args[]){

    }
}
