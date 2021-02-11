import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] arg){
        //Example2
        Date newDate = new Date();
        System.out.println(newDate.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("E, MMM:dd 'at' hh:mmm a");
        System.out.println("Current date: " + sdf.format(newDate));

        //Example3
        String startDay = "11/02/2021";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date startDate;
        try{
            startDate = df.parse(startDay);

            System.out.println(startDate);

            SimpleDateFormat ft = new SimpleDateFormat("E, MMM d");
            System.out.println("Date that was formerly a string: " + ft.format(startDate));

        } catch(ParseException e){
            e.printStackTrace();
        }

        //Example4
        String earlierDateString = "07/07/2020";
        DateFormat dF = new SimpleDateFormat("dd/mm/yyyy");
        Date earlierDate = new Date();
        System.out.println("Earlier Date:" + earlierDate);

        try{
            earlierDate = dF.parse(earlierDateString);

        } catch(ParseException e){
            e.printStackTrace();
        }
        Date currentDate = new Date();
        boolean isTodayAfterEarlierDate = currentDate.after(earlierDate);
        System.out.println("Today is after earlier date: " + isTodayAfterEarlierDate);
    }
}
