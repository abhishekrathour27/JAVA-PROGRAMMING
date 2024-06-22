class Empl{
    int id;
    String name;
    int roll;
    public Empl(int Id,String n){
        id=Id;
        name = n;
        System.out.println("Id : "+id+"\nName :"+name);
    }
    public Empl(int Id,String n,int r){
        id=Id;
        name = n;
        roll = r;
        System.out.println("Id : "+id+"\nName :"+name+"\nRoll :"+roll);
    }
}
public class ch_13_9ConstOvrloding {
    public static void main(String[] args) {
       Empl e = new Empl(148, "Abhishek",197); 
    }
}
