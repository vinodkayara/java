
//Reverse thr string

public class intSix {
public static void main(String[] args) {
        
    
    String str="Vinod";

    StringBuffer sb= new StringBuffer(str);
    String result=sb.reverse().toString();
    System.out.println(result);

    String result1="";

    for(int i=str.length()-1;i>=0;i--){
        result1=result1+str.charAt(i);
    }
 System.out.println(result1);
}

}