/*
  jinhong cen
  Co Sci 290
  
  Use control structures to do string manipulation
    and user validation
    Built-in String functions
      str.length()
      str.toLowerCase() - makes all letters lowercase
      str.equal("some other string") - check if two String are
          exactly the same
      str.equalsIgnoreCase("no") - checks if two String are 
        equal regardless of case
      str.charAt(int index) - get a specific character at index
*/
public class Logic1{
  
  public static void main(String[] args){
    //declare variables
    String str = "Java Rules!";//length = 11
    int num = 10;
    for(int index = 0; index < str.length(); index++){
      //first iteration - index = 0 - "J" - index updates to 1
      //2nd iteration - index = 1 - "a" - index updates to 2...
      System.out.println(str.charAt(index));
      if(index % 2 == 0){
        System.out.println("This number is even!");
      }
     /* else{
        System.out.println("This number is odd");
      }
      */
    }
      
    
    
    
  }
}