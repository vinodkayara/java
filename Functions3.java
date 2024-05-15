//Make a fuction to multiply 2 numbers and return the sum
import java.util.*;
public class Functions3 {
    public static int calculateProduct(int a,int b){
      
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
       
        int product= calculateProduct(a,b);
        System.out.println("Product od 2 numbers is  :"+calculateProduct(a,b));
    }
}
