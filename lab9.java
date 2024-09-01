import java.util.*; 
class employee 
{
String name; 
Date appdate; 
employee(String n,Date appdt) 
{
name=n; 
appdate=appdt; 
}
void display() 
{
System.out.println("Employee appointment date"); 
System.out.println(name +" "+ appdate.getDate() +"/"+ appdate.getMonth() +"/"+ 
appdate.getYear()); 
}
}
class employeedemo 
{
public static void main(String[] args) 
{

int i,j; 
employee emp[]=new employee[3]; 
emp[0]=new employee("Likitha",new Date(2000,05,22)); 
emp[1]=new employee("Anu",new Date(1990,01,12));
emp[2]=new employee("Sandeep",new Date(1998,04,20)); 

for(i=0;i<3;i++) 
emp[i].display();

for(i=0;i<emp.length;i++) 
{
for(j=0;j<emp.length;j++) 
{
if(emp[i].appdate.before(emp[j].appdate)) 
{
employee t=emp[i]; 
emp[i]=emp[j]; 
emp[j]=t; 
}
}
}
System.out.println("***************************************"); 
System.out.println("list of employee"); 
for(i=0;i<emp.length;i++) 
emp[i].display(); 
}
}
