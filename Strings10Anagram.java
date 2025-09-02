package com.stringpractice;

import java.util.Arrays;

public class Strings10Anagram {
	
	public static String conv_lower(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch>=65&&ch<=90) {
				res=res+((char)(ch+32));
				
			}
			else {
				res=res+(ch);
			}
			}
		return res;
	}
	public static void b_sort(char[] arr) {
		
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					char tem=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tem;
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static char[] conv_chararray(String s) {
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i]=s.charAt(i);
		}
		return arr;
	}
	
	public static boolean comp_arrays(char arr1[],char arr2[]) {

        boolean areEqual = true;

       
        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
          
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        return areEqual;
	}
	 
	public static void main(String[] args) {
		String s1="Listen";
		String s2="silent";
		
		String a=conv_lower(s1);
		String b=conv_lower(s2);
		
		 char[] arr1 = conv_chararray(a);
	     char[] arr2 = conv_chararray(b);
		
		b_sort(arr1);
		b_sort(arr2);
		
		if(comp_arrays(arr1,arr2)==true) {
			System.out.println("its anagram");
		}
		else {
			System.out.println("its not");
		}

	}

}
