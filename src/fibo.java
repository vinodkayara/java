

public class fibo {
    public static void main(String[] args) {
        int n=10;
        int firstNumber=0;
        int SecNumber=1;
        int ThirdNum=0;

        for(int i=1;i<=n;i++){
            System.out.print(firstNumber+" ");
            ThirdNum=firstNumber+SecNumber;
            firstNumber=SecNumber;
            SecNumber=ThirdNum;
            
        }
       
        
    }
}
