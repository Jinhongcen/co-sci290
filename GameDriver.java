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
    
    //variable declarations with default values
    Scanner input = new Scanner(System.in); //initialize Scanner for user input

    System.out.println("                 _____                _                 _      \n"
                   +   "   /\\/\\  _   _  /__   \\___  __ _  ___| |__   ___ _ __  (_)___  \n"
                   +   "  /    \\| | | |   / /\\/ _ \\/ _` |/ __| '_ \\ / _ \\ '__| | / __| \n"
                   +   " / /\\/\\ \\ |_| |  / / |  __/ (_| | (__| | | |  __/ |    | \\__ \\ \n" 
                   +   " \\/    \\/\\__, |  \\/   \\___|\\__,_|\\___|_| |_|\\___|_|    |_|___/ \n"
                   +   "       |___/                                                   \n"
                   +   "    ___                        ___ _       _          _        \n"
                   +   "   / __\\ __ ___  _ __ ___     / _ \\ |_   _| |_ ___   / \\       \n" 
                   +   "  / _\\| '__/ _ \\| '_ ` _ \\   / /_)/ | | | | __/ _ \\ /  /       \n"
                   +   " / /  | | | (_) | | | | | | / ___/| | |_| | || (_) /\\_/        \n"
                   +   " \\/   |_|  \\___/|_| |_| |_| \\/    |_|\\__,_|\\__\\___/\\/          \n");
    
    //story setup
    System.out.println("What is your name hero?");
    String name =" ";
    name = input.next();
    System.out.println("Great,Do you want to have a adventure?yes or no.");
    String b=" ";
    b=input.next();
    if("yes".equals(b)){
      System.out.println("Nice,I know you would choose the answer.OK ,let's start!");
    }
    
    else
    {
      System.out.println("Oh,i regret!");
      System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                     + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                     + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                     + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                     + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                     + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                     + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n"
                     + "  ___    ____                                                                   \n" 
                     + " |   |  |    |                                                                  \n" 
                     + " |___| |    _|                                                                  \n" 
                     + "  ___  |   |                                                                    \n" 
                     + " |   | |   |                                                                    \n" 
                     + " |___| |   |_                                                                   \n" 
                     + "        |____|                                                                  \n");
      
      System.exit(0);
    }
    
    
      int younum = 0;
      System.out.println("Get one number you choose between 1 to 10. ");
          younum = input.nextInt();
      int mynum = 1 + (int)(Math.random()*(10-1));
      if(younum>=11){
        System.out.println("you choose a wrong number.choose again");
        younum = input.nextInt();
      }
    int m =0;
      while(m==0){
      if(younum > mynum)
      {
        System.out.println("Good!but now just start!choose one again,now ");
        younum = input.nextInt();
        
       if(younum < mynum) 
       {
        System.out.println("Great!But I NOT believe you can win again. ");
        younum = input.nextInt();
         
       }
        else
    {
      System.out.println("Oh,i regret!You die!!");
      System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                      + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                      + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                      + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                      + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                      + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                      + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n"
                      + "  ___    ____                                                                   \n" 
                      + " |   |  |    |                                                                  \n" 
                      + " |___| |    _|                                                                  \n" 
                      + "  ___  |   |                                                                    \n" 
                      + " |   | |   |                                                                    \n" 
                      + " |___| |   |_                                                                   \n" 
                      + "        |____|                                                                  \n");
         m=1;
          System.exit(0);
    }
        
        
        
        
        
      }
      
       else
    {
      System.out.println("Oh,i regret!You die!!");
      System.out.println(" _______  _______  __   __  _______    _______  __   __  _______  ______    __  \n"
                      + "|       ||   _   ||  |_|  ||       |  |       ||  | |  ||       ||    _ |  |  | \n"
                      + "|    ___||  |_|  ||       ||    ___|  |   _   ||  |_|  ||    ___||   | ||  |  | \n"
                      + "|   | __ |       ||       ||   |___   |  | |  ||       ||   |___ |   |_||_ |  | \n"
                      + "|   ||  ||       ||       ||    ___|  |  |_|  ||       ||    ___||    __  ||__| \n"
                      + "|   |_| ||   _   || ||_|| ||   |___   |       | |     | |   |___ |   |  | | __  \n"
                      + "|_______||__| |__||_|   |_||_______|  |_______|  |___|  |_______||___|  |_||__| \n"
                      + "  ___    ____                                                                   \n" 
                      + " |   |  |    |                                                                  \n" 
                      + " |___| |    _|                                                                  \n" 
                      + "  ___  |   |                                                                    \n" 
                      + " |   | |   |                                                                    \n" 
                      + " |___| |   |_                                                                   \n" 
                      + "        |____|                                                                  \n");
         m=1;
    }
   
   
         }
    
   }
}