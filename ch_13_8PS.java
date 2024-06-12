class Add {
    int a, b, c;

    public Add(int x, int y) {
        a = x;
        b = y;
        int add = a + b;
        System.out.println("Add : " + add);

    }

    public Add(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
        int add = a + b + c;
        System.out.println("Add : " + add);

    }

}

public class ch_13_8PS {
    public static void main(String[] args) {

        Add a = new Add(1, 2, 3);

    }
}
