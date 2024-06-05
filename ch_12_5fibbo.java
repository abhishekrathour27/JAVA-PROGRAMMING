public class ch_12_5fibbo {
    static int fibbo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2 || n == 3) {
            return 1;
        } else {
            return fibbo(n - 1) + fibbo(n - 2);
        }

    }
    public static void main(String[] args) {
        System.out.println("fibbonacci :"+fibbo(5));
    }
}
