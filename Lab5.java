/*
  JinHong cen
  Co Soi290
*/
import java.util.Scanner; 
public class Lab5{

  //main method
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    
    boolean flag = false;
    int nameLength = 0;  
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
  
 }