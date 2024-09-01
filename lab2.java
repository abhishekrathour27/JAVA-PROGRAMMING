import java.util.Calendar;
public class lab2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String [] month = new String[]{"jan","fab","march","apr","may","june","july","aug","sept","oct","nov","dec"};
        System.out.println("Current month="+month[c.get(Calendar.MONTH)]);
    }
}
