//Find Maximum in a Array
public class ch_11_4PS {
    public static void main(String[] args) {
        int[] arr = {4,7,2,9,12};
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > arr[i+1]){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);
    }
}
