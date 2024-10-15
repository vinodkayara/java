
import java.util.Arrays;

//Anagram 

public class intFour {
    public static void main(String[] args) {
            String str1="stop";
            String str2="tops";

            char[] arr1=str1.toLowerCase().toCharArray();
            char[] arr2=str2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if(Arrays.equals(arr1,arr2)){
                    System.out.println("Given strings are anagram");
            }
            else{
                System.out.println("Arrays are not anagram");

            }
    }
}
