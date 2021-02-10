import java.io.Console;

public class Shipper {
    public static void main(String[] args){
        int priceModifier = 100;
        
       int weighted = getDetails("packageWeight");
       int kms = getDetails("distance");
        int total = (weighted + kms) * priceModifier;

       System.out.println("Your total shippig costs will be: " + total + " dollars");

    }

    public static int getDetails(String item){
        
        Console myConsole = System.console();

        System.out.println("Enter details for " + item);
        String itemDetails = myConsole.readLine();
        int num = Integer.parseInt(itemDetails);

        int receipt = 0;
        if(item.equals("packageWeight")){
            receipt = num / 10;
        } else if(item.equals("distance")){
            receipt = num / 5;
        }
        return receipt;
    }
}