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
    
    tool.testwrite("testWriting.txt");//save name in testWriting.txt
    tool.readFile("testWriting.txt");//read stroy line
    tool.readFile("Story.txt");//readFile
    
   
    int k =2; //use to count when you win 5 time you win the game 
    //story setup
    String b=" ";
    
    b=input.next();
    
    if("yes".equals(b)){  
      tool.readFile("testWriting.txt");//read stroy line
      tool.readFile("Story4.txt");//read stroy line
      
    }
    
    else{    
      tool.readFile("testWriting.txt");//read stroy line
      tool.readFile("Story1.txt");//read stroy line
      System.exit(0);
      
    }
    
    int younum = 0;
    int m =0;// for while condition
    
    while(m==0){
      int mynum = 1 + (int)(Math.random()*(10-1));
      younum = input.nextInt(); //get you number input 
      younum = tool.Ifwrongnumber(younum);
      if(younum > mynum){
        k++;
        
        tool.readFile("testWriting.txt");//read stroy line
        tool.monsterlife(k);//test monster suitation
        mynum = 1 + (int)(Math.random()*(10-1));
        younum = input.nextInt(); //get you number input 
        younum = tool.Ifwrongnumber(younum);
       if(younum < mynum){
         k++;
         
         tool.readFile("testWriting.txt");//read stroy line
        
         tool.monsterlife(k);//test monster suitation         
       }
        if(k==8){// when win 6 time , will come here
          m=k;
          tool.readFile("testWriting.txt");//read stroy line
          tool.readFile("Story2.txt");//read stroy line
          tool.testwrite1("Winner.txt");//save for winner
          System.exit(0);
        }
       
      }//end if
     else{       //if lose ,game over!
       tool.readFile("testWriting.txt");//read stroy line
       tool.readFile("Story1.txt");//read stroy line
         m=1;
          
          System.exit(0);
    }
                 }//end while
    
   }//end main
}//end class