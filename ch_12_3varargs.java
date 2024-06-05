//VARARGS is solution for multi overload method
public class ch_12_3varargs {
   static int sum(int ...arr){
     int result=0;
     for(int a:arr){
       result = result + a;
     }
     return result;
   }
   public static void main(String[] args) {
     System.out.println("Addition of 1 or 3 :"+sum(1,3));
     System.out.println("Addition of 7 or 6 :"+sum(7,6));
     System.out.println("Addition of 15 or 17 :"+sum(15,17));
     System.out.println("Addition of 15, 17 or 12 :"+sum(15,17,12));
    }
    
}