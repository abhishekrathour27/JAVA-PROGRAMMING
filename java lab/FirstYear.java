public class FirstYear
{
 String name_class,name_staff;
int noOfStu;
String[] students;
int[] marks;
FirstYear(String nc,String ns,int nstu,String[] stu,int[] m)
{
 name_class = nc;
name_staff = ns;
noOfStu = nstu;
students = stu;
marks = m;
}
void beststudent()
{
 int highestmarks = this.marks[0];
 String bestStudent = this.students[0];
 int bestMarks = this.marks[0];
for(int i=1; i<this.noOfStu; i++)
{
 if(this.marks[i]>highestmarks)
{ 
 highestmarks = this.marks[i]; bestStudent = this.students[i];
bestMarks = this.marks[i];
}
}
System.out.println("the best student is " +bestStudent+"with"+bestMarks+"marks");
}
public static void main(String[] args)
{
 String[] bcaStudents = {"Anu","Bhaskar","Chandru","David","Anjana"};
int[] bcaStudentsMarks = {550,530,450,520,580};
FirstYear firstBca = new
 FirstYear("BCA","ANILKUMAR",5,bcaStudents,bcaStudentsMarks);
firstBca.beststudent();
}
}