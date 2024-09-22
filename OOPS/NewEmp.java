package OOPS;

public class NewEmp{
    public static void main(String[] args) {
        Employee emp1 =new Employee(101,"vinod",3884,3,"doc");
        // emp1.eid=100;
        // emp1.name="vinod";
        // emp1.sal=10000;                        
        // emp1.deptno=3;
        // emp1.designation="doc";
        // emp1.getValue(101,"Vinod",10988,456,"DEv");   //this approch is by using Object reference variable
        emp1.display();
       
    }
}