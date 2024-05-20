package Strings;

public class Strings3 {
    public void main(String args[]){
        //compare
        String name1="vinod";
        String name2="vinod";

        //1 s1> s2:=ve value
        //2 s1==s2:0
        //s1< s2 : -ve value

        //==aloso works in some scenarios
        
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
    
}
