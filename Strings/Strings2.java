package Strings;
import java .util.*;
public class Strings2 {
    public static void main(String args[]){
        //concatenation
        String firstName="Vinod";
        String lastName="Kayara";
        String fullName=firstName+"@"+lastName;
        //op
        System.out.println(fullName.length());//.lngth to gove length of the string
        
        //charAt
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));//acces every character

        }


    }
}
