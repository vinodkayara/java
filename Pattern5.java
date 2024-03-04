import java.util.*;
public class Pattern5 {
    public static void main(String args[]){
int n=4;
//outer loop
        for(int i=1;i<=n;i++){
            //inner loop->space print
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // inner loop->star print
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
        }
