package OOPS;

public class Employee {
    int eid;
    String name;
    double sal;
    int deptno;
    String designation;

    Employee(int i,String s,double r,int d,String q){      //By using Constructor
        eid=i;
        name=s;
        sal=r;
        deptno=d;
        designation=q;
    }

    void getValue(int i,String s,double r,int d,String q){
        eid=i;
        name=s;
        sal=r;
        deptno=d;
        designation=q;
    }
    void display()
    {
      System.out.println(eid+" "+name+" "+sal+" "+deptno+" "+designation+" ");
    }


    // void display(){
    //     System.out.println(eid);
    //     System.out.println(name);
    //     System.out.println(sal);
    //     System.out.println(deptno);
    //     System.out.println(designation);
    // }
    // public static void main(String[] args) {
    //     Employee emp1 =new Employee();
    //     emp1.eid=100;
    //     emp1.name="vinod";
    //     emp1.sal=10000;                        //By using Reference variable  value is assigned
    //     emp1.deptno=3;
    //     emp1.designation="doc";
    //     emp1.display();


    // }
}


