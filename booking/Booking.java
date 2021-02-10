import java.io.Console;

public class Booking{
    public static void main(String[] args){
        Console myConsole = System.console();

        System.out.println("In what season are you booking a stay?");
        String season = myConsole.readLine();

        System.out.println("On the weekend, or a weeknight?");
        String dayOfWeek = myConsole.readLine();

        boolean summer = season.equals("summer");
        boolean weekend = dayOfWeek.equals("weekend");

        if(summer && weekend){
            System.out.println("Your stay is probably going to be pretty expensive! It's both peak travel season AND the weekend.");
        } else {
            System.out.println("Your stay might be expensive, but it's not during peak travel season, so it could certainly be worse!");
        }
    }
}