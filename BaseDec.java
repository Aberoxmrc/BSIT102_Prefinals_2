import java.io.*;
import java.util.*;

public class BaseDec {

     public static void main (String[]args)throws IOException{
     	System.out.print("Enter the file name with extension:");
    	Scanner Abero = new Scanner(System.in);  //creates scanner

    	File Marc = new File(Abero.nextLine()); //reads and find the file
    	Abero = new Scanner(Marc); 
    	String Roi = Abero.nextLine();

		while(Abero.hasNextLine()) 

		{

		String line = Abero.nextLine(); 
			//decodes the base64 string
		byte[] decodedBytes = Base64.getDecoder().decode(line); 
		String decodedString = new String(decodedBytes); 
		System.out.println(decodedString); //prints decoded string

		}

    	Abero.close(); //closes scanner
    }


}