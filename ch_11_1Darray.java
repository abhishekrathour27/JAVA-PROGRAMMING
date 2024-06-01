public class ch_11_1Darray {
    public static void main(String[] args) {
        // Insilize & Declaration in array
        int[] marks = { 90, 45, 77, 66, 80 };
        System.out.println(marks[3]);
        //Array length
        System.out.println(marks.length);
        //Display all element of Array
        System.out.println("All elements are");
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        // For each method
        System.out.println("All elements are");
        for(int num : marks){
            System.out.println(num);
        }
    }
}
