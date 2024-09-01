import java.util.Scanner;

class payoutOfBoundException extends Exception{
 payoutOfBoundException(String msg)
{
 System.out.println("pay out of bound Exception"+msg);
}
}
public class OutofBound{
 public static void main(String[] args) throws payoutOfBoundException{
 System.out.println("Enter Emp salary");
 Scanner sc = new Scanner(System.in);
 int salary = sc.nextInt();
 if(salary>50000)
{
 throw new payoutOfBoundException("salary is not in valid range");
}
else{
  System.out.println("Emp is eligible for 30% hike");
}
}
}