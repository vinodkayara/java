//count  charcter Occurance in a given string

public class intTwo {
    public static void main(String[] args) {
        String str="vinod is cricket player";

        int result=str.length()-str.replace("i","").length();
        System.out.println(result);
    }
    
}