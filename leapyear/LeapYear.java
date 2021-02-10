import java.io.Console;

public class LeapYear{
    public static void main(String[] args){
        Console console = System.console();
        System.out.println("What year were you born in?");
        String year = console.readLine();
        Integer birthYear = Integer.parseInt(year);

        System.out.println("You were alive for these leap years:");
        for(int i = birthYear; i < 2021; i++){
            if(i % 4 == 0){
                System.out.println(i);
            }
        }
    }
}