//extracting letters

public class intSeven {
    public static void main(String[] args) {
        String str="www.erostrum.com";

        String firstFout=str.substring(0,4);//end index is exclusive
        System.out.println(firstFout);
        String lastFour=str.substring(str.length()-4, str.length());
        System.out.println(lastFour);

        String website=str.substring(4,str.length()-4);
        System.out.println(website);
    }
    
}
