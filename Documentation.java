import java.util.Scanner;
public class Documentation{
  
  public static String weapon(int i){
    switch(i){
      case 1:
        System.out.println("You got a knife!");
        return "knife";
        
      case 2:
        System.out.println("You got a sword!");
        return "sword";
        
      case 3:
        System.out.println("You got a guy!");
        return "guy";
        
      default:
        System.out.println("You not get anything!");
        return "wrong";
        
    }
  }
  public static int monster(String yourweapon){
    if(yourweapon == "knife"){
      return 20;
    }
    else if(yourweapon == "sword"){
      return 50;
    }
    else if(yourweapon == "guy"){
      return 100;
    }
    else{
      return 0;
    }
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Please tell me your name ,adventurer!");
    
    String name;String g;
    name = input.next();
    System.out.println("Hello, "+ name +" now you maybe will save this world !");
    System.out.println("ok,now you should give me your lunck number!input a number 1-9!");
      int n;
    n = input.nextInt();
    int mynum = 1 + (int)(Math.random()*(11-1));
    if(n>mynum+1 && n<9){
     g = weapon(1);
    }
    else if(n < mynum-1 && n <9){
     g = weapon(2);
    }
    else if(n == mynum){
      g = weapon(3);
    }
    else{
     g = weapon(0);
    }
    int m;
    m = monster(g);
    if(m == 20){
      System.out.println("You just drop monster " + m + "% " + "blood!" );
      System.out.println("Your luck is not very good ,try again next time!" );
    }
    else if(m == 50){
      System.out.println("You  drop monster " +m+ "% " + "blood! Come on" );
      System.out.println("You've killed half the blood, but unfortunately,it's not enough.");
    }
    else if(m == 100){
    System.out.println("You just drop monster " + m + "% " + "blood! /n You save the world" );
    }
    else{
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
    }
    }
  
}