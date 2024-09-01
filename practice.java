import java.sql.Date;

class emp {
   String name;
   Date appDate;

   public emp(String n, Date appdt) {
      name = n;
      appDate = appdt;
   }

   public void display() {
      System.out.println("Emp appointment date:");
      System.out.println(name + "\t" + appDate.getDate() + appDate.getMonth() + appDate.getYear());
   }

}
public class practice{
   public static void main(String[] args) {
      emp e1 = new emp("aaa", new Date(2001,05,1));
      emp e2 = new emp("aaa", new Date(1990,05,1));
      emp e3 = new emp("aaa", new Date(1997,05,1));
    int i,j;
    for(i=0; i<3; i++){
      
    }
   }
}