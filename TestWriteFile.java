/*
  Jinhong cen
  
  Test writing file
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestWriteFile {
	
  public void testwrite() {
    System.out.println("Before star the game ,Please writer your name or something you want to told me ,i will save it!");
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    String v="";
    v=input.nextLine();
    String FILENAM = "testWriting.txt";

	 try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAM))) {

	 

	  bw.write(v);

	  System.out.println("Done");

	 } catch (IOException e) {

	  e.printStackTrace();

	 }

	}
  

}