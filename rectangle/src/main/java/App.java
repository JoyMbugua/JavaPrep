import models.Rectangle;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the height of your rectangle: ");
        int height = Integer.parseInt(scan.nextLine());

        System.out.println("Enter the width of the rectangle: ");
        int width = Integer.parseInt(scan.nextLine());

        Rectangle rectangle = new Rectangle(height, width);
        System.out.println("Let's see if this is a square or not..." + rectangle.isSquare());
    }
}
