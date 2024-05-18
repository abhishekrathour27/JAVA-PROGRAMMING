public class ch_5_3strFunction {
    public static void main(String[] args) {
        // Change String into Lower case
        String name = "Abhishek singh";
        System.out.println("Lower case :");
        String name1 = name.toLowerCase();
        System.out.println(name1);
        //Change String into Upper case
        System.out.println("Upper case :");
        System.out.println(name.toUpperCase());
        //Reverse a String
        System.out.println("Reverse a String :");
        StringBuilder rev = new StringBuilder(name).reverse();
        System.out.println(rev.toString());
        //SubString of String
        System.out.println("SubString :");
        System.out.println(name.substring(9));
        System.out.println(name.substring(0, 9));
        //Replace a string
        System.out.println("Replace a String :");
        System.out.println(name.replace("singh","Rathour"));
        // Tell us character at the given index
        System.out.println("Char at Index :");
        System.out.println(name.charAt(0));
        //
       

    }
}
