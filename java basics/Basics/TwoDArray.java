package Basics;

public class TwoDArray {
    public static void main(String[] args) {
        int a[][] ={{100,200},{200,300},{300,400}};
        for( int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println("Element at a[i][j]"+"="+ a[i][j]);
            }
        }
    }
}
