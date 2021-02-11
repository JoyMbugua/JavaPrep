import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] arg){

        Date newDate = new Date();
        System.out.println(newDate.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("E, MMM:dd 'at' hh:mmm a");
        System.out.println("Current date: " + sdf.format(newDate));
    }
}
