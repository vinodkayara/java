package labexercise;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[])
	{
		int n,i,f=0;
		Scanner S =new Scanner(System.in);
		System.out.println("enter a number");
		n=S.nextInt();
		if(n==0||n==1)
		{
			System.out.println(n+"is not prime number");
		}
		else
			for(i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+"is not a prime number");
					f=1;
					break;
				
				}
		}
		if(f==0)
		{System.out.println(n+"is prime number");
	}
	}

}
