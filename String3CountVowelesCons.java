package com.stringpractice;

public class String3CountVowelesCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="p e n tagon";
		
		int v_count=0;
		int c_count=0;
		int s_count=0;
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				v_count++;
			}
			else if(ch==32) {
				s_count++;
			}
			else {
				c_count++;
			}
		}
		System.out.println(v_count);
		System.out.println(s_count);
		System.out.println(c_count);
		
		

	}

}
