class Employeee{
   private int id,salary;
   private String name,address;
    public void getIdSal(int Id,int sal){
        id = Id;
        salary = sal;
    }
    public void setIdSal(){
        System.out.println("Id = "+id);
        System.out.println("Salary = "+salary);
    }
    public void getNameAdd(String n,String add){
        name = n;
        address = add;
    }
    public void setNameAdd(){
       System.out.println("Name = "+name);
       System.out.println("Address = "+address);
    }

    
}


public class ch_13_2GetterSetter {
    public static void main(String[] args) {
        Employeee obj = new Employeee();
      
        obj.getIdSal(123,50000);
        obj.getNameAdd("Abhishek", "Bihar");
        obj.setIdSal();
        obj.setNameAdd();
        
    }
}
