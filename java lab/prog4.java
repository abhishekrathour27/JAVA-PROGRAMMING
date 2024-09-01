import java.util.Scanner;

class myException extends Exception{
  myException(String msg){
   System.out.println("pay out of bound"+msg);
}
}
public class prog4{
 public Static void main(String[] args)throws myException{
 System.out.println("Enter employee salary");
  Scanner sc = new Scanner(System.in);
  int salary = sc.nextInt();
 if(salary>50000){
  throws new myException("salary is not in valid range");
else{
 System.out.println("Employee is eligible");
}
}
}
