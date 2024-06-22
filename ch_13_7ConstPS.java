class math {
    int x, y,add,sub,mul,div;

    public math(int a, int b) {
        x = a;
        y = b;
    }

    public void add() {
         add = x + y;
         System.out.println("Sum : "+add);
    }
    public void sub() {
        sub = x - y;
        System.out.println("Sub : "+sub);
    }
    public void mul() {
        mul = x * y;
        System.out.println("Mul : "+mul);
    }
    public void div() {
        div  = x / y;
        System.out.println("Div : "+div);
    }
}


public class ch_13_7ConstPS {
    public static void main(String[] args) {

      math m = new math(10, 5);
      m.add();
      m.sub();
      m.mul();
      m.div();
    }
}
