public class intTen {
    public static void main(String[] args) {
        String str="How are you ";
        String result="";
        
        String arr[]=str.split(" ");

        for(String word:arr){

            //operation -> logic to reverse the string
            String reverseword="";
            int j=word.length();
             while(j>0){
                char ch=word.charAt(j-1);
                reverseword=reverseword+ch;
                j--;

             }
             result=result+reverseword+" ";

        }
        System.out.println(result);

    }
    
}
