
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
        String buffer = "";
        int i = text.length()-1;
        while(i >= 0){
            buffer = buffer + text.charAt(i);
            i--; 
        }
        return buffer;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in your text: ");
        String text = reader.nextLine();

        System.out.println("In reverse order: " + reverse(text));
    }
}
