/*
  Author: Jinhong cen
  
  Purpose: Play with builtin functions for the 
    String class
*/
public class TestStringMethonds{
  //main method
  public static void main(String[] args){
    
  //hardcode a random string
  String str = "123abc!45";//"cat", "!", "Hi, there!"
    
  //one way to go through each character in a string
  char character1 = str.charAt(0);
  char character2 = str.charAt(1);
  char character3 = str.charAt(2);
  char character4 = str.charAt(3);
  //print out the characters that was parsed out with charAt(index) 
  System.out.println("List of characters parsed:(1)-" + character1
                    +" (2) - " + character2 + " (3) - " + character3
                    + " (4) - " + character4);
    //why do it the way above, if you had 1000 characters to look at?
    //why not use a for-loop?
    for(int i = 0;i < str.length();i++){
      System.out.println("i = " + i + " ,letter parsed: " + str.charAt(i));
    }
    //how do i check if a character is a number?
    if(Character.isDigit(str.charAt(0))){
      System.out.println("This is a digit! " +str.charAt(0));
    }
    else{
      System.out.println("This is not a digit! " + str.charAt(0));
    }//end
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}