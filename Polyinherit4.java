package labexercise;

import java.util.Scanner;
class Staff {
 private String staffId;
 private String name;
 private int phone;
 private float salary;
 public void accept() {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Staff Id");
 staffId = scanner.next();
 System.out.println("Enter Name");
 name = scanner.next();
 System.out.println("Enter Phone");
 phone = scanner.nextInt();
 System.out.println("Enter Salary");
 salary = scanner.nextFloat();
 }
 public void display() {
 System.out.println("Staff Id: " + staffId);
 System.out.println("Name: " + name);
 System.out.println("Phone: " + phone);
 System.out.println("Salary: " + salary);
 }
public void Display() {
	// TODO Auto-generated method stub
	
}
}
class Teaching extends Staff {
 private String domain;
 private String[] publications;
 public Teaching(int i, String string, String string2, int j, String string3, int k) {
	// TODO Auto-generated constructor stub
}
public void accept() {
 super.accept();
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Domain");
 domain = scanner.next();
 System.out.println("Enter Number of Publications");
 int n = scanner.nextInt();
 publications = new String[n];
 System.out.println("Enter Publications");
 for (int i = 0; i < n; i++) {
 publications[i] = scanner.next();
 }
 }
 public void display() {
 super.display();
 System.out.println("Domain: " + domain);

 System.out.println("Publications:");
 for (int i = 0; i < publications.length; i++) {
 System.out.println(publications[i]);
 }
 }
}
class Technical extends Staff {
 private String[] skills;
 public Technical(int i, String string, String string2, int j, String string3) {
	// TODO Auto-generated constructor stub
}
public void accept() {
 super.accept();
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Number of Skills");
 int n = scanner.nextInt();
 skills = new String[n];
 System.out.println("Enter Skills");
 for (int i = 0; i < n; i++) {
 skills[i] = scanner.next();
 }
 }
 public void display() {
 super.display();
 System.out.println("Skills:");
 for (int i = 0; i < skills.length; i++) {
 System.out.println(skills[i]);
 }
 }
}
class Contract extends Staff {
 private int period;
 public Contract(int i, String string, String string2, int j, int k) {
	// TODO Auto-generated constructor stub
}
public void accept() {
 super.accept();
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter Period");
 period = scanner.nextInt();
 }
 public void display() {
 super.display();
 System.out.println("Period: " + period);
 }
}
class Main {
 public static void main(String[] args) {
 Teaching teaching = new Teaching();
 Technical technical = new Technical();
 Contract contract = new Contract();
 System.out.println("Enter Details for Teaching Staff Member");
 teaching.accept();
 System.out.println("Enter Details for Technical Staff Member");

 technical.accept();
 System.out.println("Enter Details for Contract Staff Member");
 contract.accept();
 System.out.println("Details for Teaching Staff Member are");
 teaching.display();
 System.out.println("Details for Technical Staff Member are");
 technical.display();
 System.out.println("Details for Contract Staff Member are");
 contract.display();
 }
}

class Staf
{
private int StaffId;
private String Name;
private String Phone;
private long Salary;
public Staf(int staffId,String name,String phone,long salary)
{
 StaffId = staffId;
 Name = name;
 Phone = phone;
 Salary = salary;
}
public void Display()
{
 System.out.print("\t"+StaffId+"\t"+Name+"\t\t"+Phone+"\t\t"+Salary);
}
}
class Teaching extends Staff
{
private String Domain;
private int Publications;
public Teaching(int staffId, String name, String phone,long salary, String domain, int 
publications)
{
 super(staffId, name, phone, salary);
 Domain = domain;
 Publications = publications;
}
public void Display()
{
 super.Display();
 System.out.print("\t\t"+Domain+"\t\t"+Publications+"\t\t"+"--"+"\t"+"--");
}
}
class Technical extends Staff
{
private String Skills;

public Technical(int staffId, String name, String phone,long salary, String skills)
{
 super(staffId, name, phone, salary);
 Skills = skills;
}
public void Display()
{
 super.Display();
 System.out.print("\t\t--"+"\t\t"+"--"+"\t"+Skills+"\t"+"--");
}
}
class Contract extends Staff
{
private int Period;
public Contract(int staffId, String name, String phone, long salary, int period)
{
 super(staffId, name, phone, salary);
 this.Period = period;
}
public void Display()
{
 super.Display();
 System.out.print("\t\t--"+"\t\t"+"--"+"\t\t"+"--"+"\t"+Period);
}
}
public class Polyinherit4
{
public static void main(String[] args)
{
Staff staff[]=new Staff[3];
 staff[0]=new Teaching(0001,"Raju","271173",90000,"CSE",3);
 staff[1]=new Technical(0002,"Anu","271172",20000,"Server Admin");
 staff[2]=new Contract(0003,"Ganavi","271174",9000,3);
System.out.println("StaffID\tName\t\tPhone\t\tSalary\t\tDomain\tPublication\tSkills\t\tPeriod");
for(int i=0;i<3;i++)
{
 staff[i].Display();
 System.out.println();
}
}
}
