package Basics;

public class String1 {
    public static void main(String[] args) {
        String s =" Vinod";
        String s1="  Kayara";
        
        System.out.println(s.length()); //length of the string
        System.out.println(s.concat(s1)); //join the strings
        System.out.println(s1.trim()); // eliminate the space
        System.out.println(s.charAt(3)); // character at given index
        System.out.println(s.contains("od")); //check the mentioned sequance
        System.out.println(s.equals(s1)); //compare the strings
        System.out.println(s.equalsIgnoreCase(s1)); //proper case sensitive output
        System.out.println(s.replace("in","ka"));
        System.out.println(s.substring(1,4)); //ending index starts from 1 ,starting index starts from 0
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
    
    }
    
}
