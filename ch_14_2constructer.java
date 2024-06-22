//constructer in Inhertance
class base1 {
    int a;

    public base1() {

        System.out.println("I am a constructer of base1 ");
    }

    public base1(int x) {
        System.out.println("I am a constructer of base1 with value of " + x);
    }
}

class base2 extends base1 {
    public base2() {
        System.out.println("I am a constructer of base2");
    }

    public base2(int x, int y) {
        super(1);
        System.out.println("I am a constructer of base1 with value of " + y);
    }
}

public class ch_14_2constructer {
    public static void main(String[] args) {
        base2 b = new base2(1,2);
    }
}
