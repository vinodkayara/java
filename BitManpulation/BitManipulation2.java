package BitManipulation;
import java.util.*;

public class BitManipulation2 {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos =1 ; // example position
        int bitMask = 1<< pos; // corrected bitMask initialization

     int newNumber=bitMask | n;
         System.out.println(newNumber);
    }
}