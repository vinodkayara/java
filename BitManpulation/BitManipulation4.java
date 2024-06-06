package BitManipulation;
import java.util.*;

public class BitManipulation4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();

        //oper=1 : set oper=0: clear
        
        int n = 5; // 0101
        int pos =2 ; // example position

        int bitMask = 1<< pos; // corrected bitMask initialization
        if(oper==1){
            //set

            int newNumber=bitMask | n;
            System.out.println(newNumber);
        }else{
            //clear
            int newBitMask= ~(bitMask);
            int newNumber=newBitMask & n;
            System.out.println(newNumber);
        }
        }

    
}