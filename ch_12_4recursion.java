//Factorial of N number
public class ch_12_4recursion {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n=1;
        System.out.println("Factorial : "+fact(n));
    }
}
