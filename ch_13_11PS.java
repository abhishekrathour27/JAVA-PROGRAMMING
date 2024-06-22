//Overload a constructer to find parameter of rectangle
class rectangle {
   private int l, b;

    public rectangle() {
        this.l = 4;
        this.b = 5;
        int area = l * b;
        System.out.println("Area = "+area);
    }
    public rectangle(int x, int y) {
        l = x;
        b = y;
        int area = l * b;
        System.out.println("Area = "+area);
    }
}

public class ch_13_11PS {
    public static void main(String[] args) {
        rectangle r = new rectangle(7,5);
    }
}
