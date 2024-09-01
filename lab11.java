public class lab11 {
    public static void main(String args[]) {
        String city = null;
        try {
            if (city.equals("BANGALORE"))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block will be always executed");
        }
    }
}
 