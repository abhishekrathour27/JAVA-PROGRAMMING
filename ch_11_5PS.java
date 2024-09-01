//Reverse an Array 
public class ch_11_5PS {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int  l = a.length - 1, temp;
        int s = 0,e = 4;
       int  m = (s+e)/2;
        for (int i = 0; i <= m; i++) {

            temp = a[i];
            a[i] = a[l - i];
            a[l - i] = temp;
        }

        for (int ele : a) {
            System.out.println(ele);
        }
    }
}
