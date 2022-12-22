package labexercise;

public class SimpleCalculator2 {
	public static void main(String[]args) {
		String str=new java.util.Scanner(System.in).nextLine();
		String[]data= str.split(" ");
		double num1,num2,result;
		String opr=data[1];
		num1=Double.parseDouble(data[0]);
		num2=Double.parseDouble(data[2]);
		switch(opr) {
		case"+":
			result=num1+num2;break;
		case"-":
			result=num1-num2;break;
		case"*":
			result=num1*num2;break;
		case"/":
			result=num1/num2;break;
		case"%":
			result=num1%num2;break;
			default:
				System.out.println("Invalid operator!");
				return;
			
		}
		System.out.println(num1+""+opr+""+num2+"="+result);
	}

}
