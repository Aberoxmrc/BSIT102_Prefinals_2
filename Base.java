
import java.util.*;
import java.io.*;

public class Base {

public static void main(String[] args) throws IOException {
    Scanner Abero = new Scanner(System.in); //creates a scanner
    System.out.println("Input "); 
    String Marc = Abero.nextLine();  //scans the input
    FileWriter fw = new FileWriter(userInput); //create a new filewriter

    while (userInput != null) {  //will create an loop
        System.out.println("Enter text: ");
        Marc = Abero.nextLine();  

        if (Marc.equals(":q")) //if :q is written then loop will be broken
            break; 

        String encodedString = Base64.getEncoder().encodeToString(userInput.getBytes()); // encodes the string into base 64
        System.out.println(" " + encodedString); 
        fw.write(encodedString + "\n"); 
    }
    Abero.close(); //closes scanner
    fw.close(); //closses filewriter
}


}