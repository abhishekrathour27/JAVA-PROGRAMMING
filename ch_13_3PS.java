// Create a class phone with ringing,vibrating & calling
class phone{
    public void Ringing(){
        System.out.println("Ringing...");
    }
    public void Vibrating(){
        System.out.println("Vibrating...");
    }
    public void Call(){
        System.out.println("Calling...");
    }
}

public class ch_13_3PS {
    public static void main(String[] args) {
        phone obj = new phone();
        obj.Ringing();
        obj.Vibrating();
        obj.Call();
        
    }
}
