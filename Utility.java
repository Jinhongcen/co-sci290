/*
  JINHONG CEN
  
  This Utility class houses all the custom methods
  that support my text adventure.
*/
import java.io.BufferedReader;
import java.io.FileReader;
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
  
}//end class