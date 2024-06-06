package BitManipulation;
import java.util.*;

public class BitManipulation1 {
    public static void main(String args[]) {
        int n = 5; // 0101
        int pos = 1; // example position
        int bitMask = 1<< pos; // corrected bitMask initialization

        if ((bitMask & n) == 0) {
            System.out.println("bit was zero");
        } else {
            System.out.println("bit was one");
        }
    }
}
