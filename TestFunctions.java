/*
   jinhong cen
   CoSci 290
   
   Topics:
     functions/methods - what all the different parts are
     -access modifier
     -return type
     -function name 
     -parameters (optional)
*/
public class TestFunctions{
 
 public static void main(String[] args){
   /*
    access modifiers
    public - anything can see/access
    private - only functions within a class can access
    defaulf - same thing as no written/declared modifiers
    
    return types
    -int
    -double
    -String
    -chat
    -boolean
    -void - doen't return anything
    -also can different objects types
    
    function names 
    -follows the same rules as any identifer
    -use the name of the function to call it
    function parameters
    -input that the function uses inside somewhere
      in the function body
    -separate multiple parameters with commas
   */
   
   //testing custom function called findSum()
  
 //this function finds the sum of two given numbers
   
    System.out.println("the sum of 2 and 3 is: "+findSum(2,3));
   
   //test printHello()
   printHello("jin");
 }
    public static int findSum(int num1,int num2){
      int sum = num1 + num2;
      return sum;
      
    }
  public static void printHello(String name){
     System.out.println("Hello "+name);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}