public class Math{
int sum(){
 return 10+10;
}
int sum(int a,int b){
 return (a+b);
}
float sum(float x,float y){
 return(x+y);
}
public static void main(String[] args)
{
 Math m = new Math();
 System.out.println("Sum of default value="+m.sum());
 System.out.println("Sum of intger value="+m.sum(5,5));
 System.out.println("Sum of float value="+m.sum(4.5f,5.5f));
}
}