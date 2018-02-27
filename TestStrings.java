/*
  jinhong cen
  Co Sci 290
  
  Demo on the String class
*/  
import java.util.Scanner; 
public class TestStrings{

  //main method
  public static void main(String[] args){
    //instantiate the Scanner object
    Scanner input = new Scanner(System.in);
    
    //System.out.println("Are you rich? Yes or No?");
    
   // String answer = input.next();
    
    boolean flag = false;
    
  
    //answer = answer.toLowerCare(); 
    //toLowerCase() 
    //name.length() - gives a int of how many characters the String is long
    //name.charAt(0) to look at the character in index 0
    int nameLength = 0;  
   // if(answer.equalslgnoreCare("no")){
   // System.out.println("That sucks!");
   // }
   // else{
   //   System.out.println("Cool.");
  //  }  
    
    System.out.println("input you name");
    int i=1;
    String names = input.next();
    while(i==1){
     
    if(names.length() <= 2 || flag ==true){
      
      System.out.println("Please enter in a name that is at least two characters long,or it'isnt not letter ,input your name again.");
      
       names = input.next();
      flag = false;
    }
      else {
        for(int index = 0; index < names.length();index++){
          
          if(!Character.isLetter(names.charAt(index))){//if it's not a letter
            flag = true;
            i=1;
            break;//gets out of current loop
          }
          else{
            i=2;
          }
          
        }
          
        }
      }
    System.out.println("your name is "+names);
                    }
    /*
      Example below is to test for specific response
      answer.toUpperCase() - make all letters uppercase
      answer.equalsIgnoreCare("no") - check if two Strings are
      equal regardless of case
    */  
  
    
  }

