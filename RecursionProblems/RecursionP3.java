//FIND THE 1ST AND LAST OCCURANCE OF AN ELEMENT IN STRING

package RecursionProblems;

public class RecursionP3 {
    public static int first=-1;
    public static int last=-1;

    public static void findOccurance(String str,int index,char element){
        if(index==str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char CurrChar=str.charAt(index);
        if(CurrChar==element){
            if(first==-1){
                first=index;

            }else{
                last=index;
            }

        }
        findOccurance(str, index+1, element);
    }
public static void main(String[] args) {
    String str="abaacdaefaah";
    findOccurance(str, 0, 'a');
}
}

