//User input in 2-D Array
import java.util.Scanner;
public class ch_11_2Darray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        System.out.println("Enter element of array: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }
        for(int ele : arr){
            System.out.print(ele);
        }
    }
}
