import java.io.Console;

public class Rate{
    public static void main(String[] args){

        Console console = System.console();

        System.out.println("How old are you?");

        String stringUserAge = console.readLine();

        int integerUserAge = Integer.parseInt(stringUserAge);

        if(integerUserAge >= 17){
            System.out.println("You can see the movie!");
        } else if((17 - integerUserAge) == 1){
            System.out.println("Too young! Please come back after " + (17 - integerUserAge) + " year to watch this movie!");
        }
         else{
            System.out.println("Too young! Please come back after " + (17 - integerUserAge) + " years to watch this movie!");
        }

    }


}