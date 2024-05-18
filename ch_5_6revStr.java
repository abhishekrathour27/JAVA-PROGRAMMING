public class ch_5_6revStr {
    public static void main(String[] args) {
        String name = "Abhishek";
        StringBuilder revname = new StringBuilder(name).reverse();
        System.out.println(revname.toString());
    }
}
