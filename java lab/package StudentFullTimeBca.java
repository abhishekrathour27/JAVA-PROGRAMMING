package StudentFullTimeBca;  
public class Student  
{  
int age;  
char gender;  
String name;  
public void getdata(String n,int a,char g)  
{ 
name=n;  
age=a;  
gender=g;  
}  
public void display()  
{  
System.out.println("Name= " +name);  
System.out.println("Age= " +age);  
System.out.println("Gender= " +gender);  
}  
} 
 
import StudentFullTimeBca.Student;  
class ptest  
{  
public static void main(String[] args)  
{ 
 Student s=new Student();  
 s.getdata("Sara",18,'F');  
 s.display();  
}  
}