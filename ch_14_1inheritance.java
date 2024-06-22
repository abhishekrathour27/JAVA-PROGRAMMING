//Inheritance 
class math1{
    int a,b;
    public void getter(int x,int y){
        a=x;
        b=y;
    }
    public void add(){
        int sum = a + b;
       System.out.println("Sum = "+sum);
    }
}
class math2 extends math1{
    public void getter(int x,int y){
        a = x;
        b = y;
    }
    public void subtract(){
        int sub = a-b;
        System.out.println("Sub = "+sub);
    }
}

public class ch_14_1inheritance {
    public static void main(String[] args) {
      math2 m = new math2();
      m.getter(10, 5); 
      m.add();
      m.subtract(); 
    }
}
