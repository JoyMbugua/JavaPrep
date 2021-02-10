public class Groceries{
    public static void main(String[] args){

        String[] groceryList = {"icecream", "apples", "hot sauce"};
        Integer[] groceriesPrice = {10, 35, 70};

        for(String item: groceryList){
            System.out.println(item);
        }

        int total = 0;
        for(int price : groceriesPrice){
            total += price;
        }

        System.out.println("Your total will be: " + total + " shillings.");
    }
}