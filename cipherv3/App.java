import java.util.Scanner;

public class App {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Would you like to cipher or decipher the text? ");
        String cipherChoice = scan.nextLine();

        System.out.println("Enter text to encrypt:");
        String text = scan.nextLine();

        System.out.println("Enter password: ");
        int pass = scan.nextInt();

      
        Ceaser textToCipher = new Ceaser(text, pass);

        if(cipherChoice.equals("cipher")){
            System.out.println(textToCipher.cipherWord());
        } else if(cipherChoice.equals("decipher")){
            System.out.println(textToCipher.decipherWord());
        } else{
            System.out.println("Sorry. We do not recognize your input. Please try again");
        }
       
    }

}
