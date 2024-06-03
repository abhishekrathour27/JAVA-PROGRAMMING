//Maximum in an ArrayQAZSCF 

public class ch_11_6PS {
    public static void main(String[] args) {
        int[] arr={6,12,9,15,5};
        int max=0;
        for(int i=1; i<arr.length; i++){
           if(max<arr[i]){
            max = arr[i];
           }
        }
        System.out.println("Max : "+max);
        
    }
}
