//FIND THE NUMBER OF WAYS IN WHICH YOU CAN INVITE N PEOPLE TO YOUR PARTY,SINGLE OR IN PAIRS.

package RecursionAdvPrb;

public class RecursionAdP4 {
    public static int callGuest(int n){
        if (n<=1) {
            return 1;
            
        }
        //single
        int ways1 =callGuest(n-1);

        //pairs
        int ways2=(n-1)*callGuest(n-2);
        return ways1+ways2;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(callGuest(n));
    }
}
