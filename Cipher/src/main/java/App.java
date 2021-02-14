import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a plain text:");

        String word = scan.nextLine();
        int shift = 3;

        String cipherWord = "";

        char alphabet;
        for(int i = 0; i < word.length(); i++){

            //shift one character at a time
            alphabet = word.charAt(i); //get each letter from the word and assign it to alphabet
            if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char)(alphabet + shift); //get its ascii and add the key

                if(alphabet > 'z'){
                    alphabet = (char)(alphabet + 'a' - 'z' -1);
                }

                //so this is we how we store the letters into a new string
                cipherWord = cipherWord + alphabet;
            } else if(alphabet >= 'A' && alphabet <= 'Z'){
                alphabet = (char)(alphabet + shift);
                 if(alphabet > 'Z'){
                     alphabet = (char)(alphabet + 'A' - 'Z' - 1);
                 }
                 cipherWord = cipherWord + alphabet;
            } else{
                cipherWord = cipherWord + alphabet;
            }
        }

        JOptionPane.showMessageDialog(null, "Ciphered word: " + cipherWord);
    }
}
