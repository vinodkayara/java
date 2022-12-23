package labexercise;

import java.util.Scanner;

public class ArithmaticCalci {
public static void main(String args[])
{
	char opertaor;
	Double number1,number2,result;
	Scanner input=new Scanner(System.in);
	System.out.println("choose an operator:+,-,*or/");
	char operator = input.next().charAt(0);
	System.out.println("Enter first number ");
	number1=input.nextDouble();
	System.out.println("Enter seccond number");
	number2=input.nextDouble();
	switch(operator)
	{
	case'+' :result=number2+number2;
	System.out.println(number1+"+"+number2+"="+result);
	break;
	case'-' :result=number2-number2;
	System.out.println(number1+"-"+number2+"="+result);
	break;
	case'*' :result=number2*number2;
	System.out.println(number1+"*"+number2+"="+result);
	break;
	case'/' :result=number2/number2;
	System.out.println(number1+"/"+number2+"="+result);
	break;
	default:System.out.println("Invalid operation!!");
	break;
	
	}
	
	input.close();
}


private static void close() {
	// TODO Auto-generated method stub
	
}
}
