package Basics;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==7){
                break; //continue statement skips 7 and prints
            }
            System.out.println(i);
        }
    }
}
