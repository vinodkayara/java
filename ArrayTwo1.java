package com.twodimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwo1 {
	public static void print_matrix(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int arr[] [] = new int[3][3];
		
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.deepToString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(arr));
		

	}

}
