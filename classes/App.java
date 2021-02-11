import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStreamReader;
import java.io.IOException;

public class App{
    public static void main(String[] args){

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        List<Vehicle> allVehicles = new ArrayList<Vehicle>();
        allVehicles.add(hatchback);
        allVehicles.add(suv);
        allVehicles.add(sedan);
        allVehicles.add(truck);
        allVehicles.add(crossover);

        boolean isProgramRunning = true;
        while(isProgramRunning){
            BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to our car dealership. What would you like to do? Enter one of the following options:" +
                    " All Vehicles, Add a vehicle, or Search Price. (Type 'Exit' to exit)");
            try{
                String navigationChoice = buffReader.readLine();

                if(navigationChoice.equals("All Vehicles")){
                    for(Vehicle vehicle : allVehicles){
                        System.out.println("--------------------");
                        System.out.println(vehicle);
                        System.out.println(vehicle.getYear());
                        System.out.println(vehicle.getBrand());
                        System.out.println(vehicle.getModel());
                        System.out.println(vehicle.getMiles());
                        System.out.println(vehicle.getPrice());
                    }
                } else if(navigationChoice.equals("Search Price")){
                    System.out.println("what is your maximum budget for a vehicle?");
                    String stringUserMaxBudget = buffReader.readLine();
                    int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

                    for(Vehicle vehicle : allVehicles){
                        if(vehicle.worthBuying(userMaxBudget)){
                            System.out.println("---------");
                            System.out.println("You can afford:");
                            System.out.println(vehicle.getYear());
                            System.out.println(vehicle.getBrand());
                            System.out.println(vehicle.getModel());
                            System.out.println(vehicle.getMiles());
                            System.out.println(vehicle.getPrice());
                        }
                    }

                } else if(navigationChoice.equals("Add a vehicle")){
                    System.out.println("Alright! Let's add another vehicle! What year was this vehicle made?");
                    String newYear = buffReader.readLine();
                    int theYear = Integer.parseInt(newYear);
                    System.out.println("Great! what make or brand is the vehicle?");
                    String userBrand = buffReader.readLine();
                    System.out.println("Got it! what model is it?");
                    String userModel = buffReader.readLine();
                    System.out.println("And how many miles does it have on it?");
                    int userMiles = Integer.parseInt(buffReader.readLine());
                    System.out.println("Finally, what is its price?");
                    int userPrice = Integer.parseInt(buffReader.readLine());

                    Vehicle userVehicle = new Vehicle(theYear, userBrand, userModel, userMiles, userPrice);
                    //action you want with the userVehicle e.g. printing

                    allVehicles.add(userVehicle);
                    System.out.println(allVehicles);
                }else if(navigationChoice.equals("Exit")){
                    isProgramRunning = false;
                } else {
                    System.out.println("Sorry, we do not recognize your input.");
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}