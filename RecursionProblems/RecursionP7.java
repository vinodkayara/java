//PRINT ALL SUBSEQUANCES OF A STRING

package RecursionProblems;

public class RecursionP7 {
    public static void subSequances(String str ,int idx ,String newString){
if(idx==str.length()){
    System.out.println(newString);
    return;
}
char currChar=str.charAt(idx);

//to be
subSequances(str, idx+1,newString+currChar);

// or not to be
subSequances(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str ="abc";
        subSequances(str, 0, "");
    }
    
              }
