package BitManipulation;
import java.util.*;

public class BitManipulation3 {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos =2 ; // example position
        int bitMask = 1<< pos; // corrected bitMask initialization
        int notBitMask= ~(bitMask);

     int newNumber=notBitMask & n;
         System.out.println(newNumber);
    }
}