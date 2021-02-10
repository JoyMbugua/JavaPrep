import java.io.Console;
public class App{
    public static void main(String[] args){

        Console console = System.console();

        Vehicle hatchback = new Vehicle();
        hatchback.mYear = 1994;
        hatchback.mBrand = "subaru";
        hatchback.mModel = "Legacy";
        hatchback.mMiles = 170000;
        hatchback.mPrice = 4000;

        Vehicle suv = new Vehicle();
        suv.mYear = 2002;
        suv.mBrand = "Ford";
        suv.mModel = "Explorer";
        suv.mMiles = 100000;
        suv.mPrice = 7000;

        Vehicle sedan = new Vehicle();
        sedan.mYear = 2015;
        sedan.mBrand = "Toyota";
        sedan.mModel = "Camry";
        sedan.mMiles = 50000;
        sedan.mPrice = 30000;

        Vehicle truck = new Vehicle();
        truck.mYear = 1999;
        truck.mBrand = "Ford";
        truck.mModel = "Ranger";
        truck.mMiles = 100000;
        truck.mPrice = 4000;

        Vehicle[] allVehicles = {hatchback, suv, sedan, truck};
        System.out.println("All Vehicles:");

        for(Vehicle vehicle : allVehicles){
            System.out.println("--------------------");
            System.out.println(vehicle);
            System.out.println(vehicle.mYear);
            System.out.println(vehicle.mBrand);
            System.out.println(vehicle.mModel);
            System.out.println(vehicle.mMiles);
            System.out.println(vehicle.mPrice);
        }

        System.out.println("what is your maximum budget for a vehicle?");
        String stringUserMaxBudget = console.readLine();
        int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

        for(Vehicle vehicle : allVehicles){
            if(vehicle.worthBuying(userMaxBudget)){
                System.out.println("---------");
                System.out.println("You can afford:");
                System.out.println(vehicle.mYear);
                System.out.println(vehicle.mBrand);
                System.out.println(vehicle.mModel);
                System.out.println(vehicle.mMiles);
                System.out.println(vehicle.mPrice);
            }
        }
    }
}