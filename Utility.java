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
import java.util.Scanner;
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
    System.out.println("Before star the game ,Please writer your name  ,i will save it!");
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    String v="";
      String k = "";
    v=input.nextLine();
    k="My dear friend "+v;

	 try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

	 

	  bw.write(k);

	  System.out.println("Done");

	 } catch (IOException e) {

	  e.printStackTrace();

	 }

	}
  
      public void testwrite1(String FILENAM) {
    System.out.println("Congratulation you are a hero!!Please writer your name  ,i will save the winner name!");
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    String v="";
      String k = "";
    v=input.nextLine();
    k=v + " ,you are a luck guy,bless you,thank you save the life!\n";

	 try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAM,true))) {

	 

	  bw.write(k);

	  System.out.println("Done");

	 } catch (IOException e) {

	  e.printStackTrace();

	 }

	}
  public int Ifwrongnumber(int wr){
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
  if(wr>=11 || wr <=0){  //number can't large than 10,less than 1.
        System.out.println("you choose a wrong number.choose again 1-10");
        wr = input.nextInt();
        return wr;
    
  }
    return wr;
        
      }
  public void monsterlife(int hurt){
    if(hurt == 3){
      System.out.println("You just drop monster " +  "10% " + "blood!\nJust star" );
    }
    else if(hurt == 4){
      System.out.println("You  drop monster " + "20% " + "blood! Come on,monster still have 70% life" );
      System.out.println("You've killed half the blood, but unfortunately,it's not enough.");
    }
    else if(hurt == 5){
    System.out.println("You just drop monster " +  "20% " + "blood! \n\nohhhh~~~near victory!" );
    }
    else if(hurt == 6){
    System.out.println("You just drop monster " +  "10% " + "blood! \n\nNow monter only have 40% blood,but he goes into a frenzy!Come on guy!" );
    }
    else if(hurt == 7){
    System.out.println("You drop monster " + "10% " + "blood! \n\nLet's give him a final blow!" );
    }
    else{
    System.out.println("You  drop monster final blood! \n\n You save the world,you are hero!" );
    }
  }
  
}//end class