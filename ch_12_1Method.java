//Method call
public class ch_12_1Method {
    int add(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {
        //Method call without Object
         int a =5,b=9;
        // int c = add(a,b);
        // System.out.println("Add = "+c);
        //Method call with object
        ch_12_1Method obj = new ch_12_1Method();
        int c = obj.add(a, b);
        System.out.println("Add = "+c);
    }
}
