/*
  JinHong Cen
  CoSci 290
  
  HW1 Instructions
  1. Create a class called "GameDriver" and save/name the file "GameDriver.java".
  2. The program shold start up with your text aventure splash screen (it would 
      be a good idea to use the one from Lab 1).
  3. Next, the program should have a print out of some storytelling that starts
      the text adventure.
  4. Then set up the game with questions asked from the user to start the text
      adventure (use same questions from Lab 2).
      TIP: Use Math.random and if-else to randomize elements in the game based 
        on user input. 
  5. When the game is over, end the program with a "GAME OVER" message.
  
  REMEMBER: 
  *Declare all your variables at the beginning of the program.
      
*/

//imports used in this class
import java.util.Scanner;

//Demo HW1 
public class GameDriver{

  //start of the application
  public static void main(String[] args){
    Utility tool = new Utility(); 
    
    TestWriteFile write = new TestWriteFile();
    //variable declarations with default values
    
    Scanner input = new Scanner(System.in); //initialize Scanner for user input
    
    write.testwrite();//save name in testWriting.txt
    
    tool.readFile("Story.txt");//readFile
    
   
    int k =3; //use to count when you win 5 time you win the game 
    //story setup
    String b=" ";
    
    b=input.next();
    
    if("yes".equals(b)){
      
      tool.readFile("Story4.txt");
      
    }
    
    else{
      
      tool.readFile("Story1.txt");
      System.exit(0);
      
    }
    
    
      int younum = 0;
    
          younum = input.nextInt(); //get you number input 
    
      int mynum = 1 + (int)(Math.random()*(10-1));
    
      if(younum>=11 || younum <=0){  //number can't large than 10,less than 1.
        
        System.out.println("you choose a wrong number.choose again");
        younum = input.nextInt();
        
      }
    int m =0;
    while(m==0){
      
      if(younum > mynum){
        k++;
        tool.readFile("Story3.txt");
        younum = input.nextInt();
        
       if(younum < mynum) 
       {
       k++;
       tool.readFile("Story3.txt");
       younum = input.nextInt();
         
       
        if(k==7){
          m=k;
          tool.readFile("Story2.txt");
          System.exit(0);
        }
       }
      }//end if
     else{
      tool.readFile("Story1.txt");
         m=1;
          
          System.exit(0);
    }
                 }//end while
    
   }//end main
}//end class