/*
  JINHONG CEN
  
  This Utility class houses all the custom methods
  that support my text adventure.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Utility{
  /*
    This method opens a file and prints out each line.
  */
  public void readFile(String fileName){
    String currentLine;  //hod current line being read in file 
    
    try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
      
      //read each line in the file until the EOF
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
      }
       
      //if there is no file to open, the exception will be caught
    }catch(IOException e){
      e.printStackTrace();
    }
    
  }
    public void testwrite(String FILENAME) {
    System.out.println("Before star the game ,Please writer your name or something you want to told me ,i will save it!");
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    String v="";
    v=input.nextLine();
    

	 try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

	 

	  bw.write(v);

	  System.out.println("Done");

	 } catch (IOException e) {

	  e.printStackTrace();

	 }

	}
  
  
}//end class