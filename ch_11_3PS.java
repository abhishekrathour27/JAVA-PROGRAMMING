//Insert 5 float element in a array and find their sum
import java.util.Scanner;
public class ch_11_3PS {
    public static void main(String[] args) {
        float[] arr = new float[5];
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element in Array");
        for(int i = 0; i<arr.length; i++){
           arr[i] = sc.nextFloat();
            sum = sum + arr[i];
        }
       System.out.println("Sum ="+sum);
    }
}
