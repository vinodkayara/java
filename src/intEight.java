//recursion

// logic for solving

public class intEight {
    public static void main(String[] args) {
        String str="nitin";
        boolean result=isPalindrome(str);
        System.out.println(str+" isPalindrome ="+result);


    }
    public static boolean isPalindrome(String str){
        if(str==null){
            return false;
        }

        if(str.length()<=1){
            return true;
        }
        String first=str.substring(0,1);
        String last=str.substring(str.length()-1,str.length());
        if(!first.equals(last)){
            return false;
        }else{
            return isPalindrome(str.substring(1,str.length()-1));
        }

    }
}    
