//PRINT ALL THE UNIQUE SUBSEQUANCES OF A STRING

package RecursionProblems;

import java.util.HashSet;
public class RecursionP8 {
    public static void subSequances(String str ,int idx ,String newString, HashSet<String> set){
if(idx==str.length()){
  if(set.contains(newString)){
    return;
}else{
    System.out.println(newString);
    set.add(newString);
    return;
}
}
char currChar=str.charAt(idx);

//to be
subSequances(str, idx+1,newString+currChar,set);

// or not to be
subSequances(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str ="aaa";
        HashSet<String> set =new HashSet<>();
        subSequances(str, 0, "", set);
    }
    
              }
