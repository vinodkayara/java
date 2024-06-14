package Recursion;

public class Recursion6 {
    public static int calcPower(int x, int n){
        if(n==0){
            return 1; //base case 1
        }
        if(x==0){ //base case2
            return 0;
        }
        int xPownm1=calcPower(x,n-1);//work
        int xPown=x*xPownm1;
        return xPown;
    }
    public static void main(String args[]){
        int x=2,n=5;
        int ans =calcPower(x,n);
        System.out.println(ans);
    }
}
