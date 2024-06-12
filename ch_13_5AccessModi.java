// Private variable
class MyEmp {
    private int id;
    private String name;

    public void getId(int num) {
        id = num;
    }

    public int setId() {
        return id;
    }

    public void getName(String n) {
        name = n;
    }

    public String setName() {
        return name;
    }
}

public class ch_13_5AccessModi {
    public static void main(String[] args) {
        MyEmp obj = new MyEmp();
        obj.getId(1234);
        obj.getName("Abhishek singh");
        System.out.println(obj.setId());
        System.out.println(obj.setName());
       
    }

}