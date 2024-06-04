//Method overloading = Same name but diff parameter
public class ch_12_2OvrLoding {
    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    static int add(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }
    public static void main(String[] args) {
        int add = add(1,2,7);
        System.out.println("Add: "+add);
    }

}
