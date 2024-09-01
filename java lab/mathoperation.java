class addsub{
int n1,n2;
public addsub(int a,int b){
  n1 = a;
  n2 = b;
}
public int add(){
 return (n1+n2);
}
public int sub(){
 return(n1-n2);
}
}
class muldiv extends addsub{
 public muldiv(int a,int b){
  super(a,b);
}
public int mul(){
 return (n1*n2);
}
public int div(){
 return (n1*n2);
}
}
public class mathoperation{
 public static void main(String[] args){
 muldiv ob = new muldiv(20,10);
 System.out.println("Sum ="+ob.add());
 System.out.println("Subtract ="+ob.sub());
 System.out.println("multiply ="+ob.mul());
 System.out.println("devide ="+ob.div());
}
}