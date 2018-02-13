/*
 jinghong cen
 Co-sci290
 Testing datatypes and input from the user
 02/13/2018
*/
import java.util.Scanner; //IS a java object
public class TestInput{
  //main method - starting point of application
  public static void main(String[] args){
    //datatype variableName = expression
    //1. Identifiers can only start with a letter, _, or $
    //2. Identifiers with multiple words are camelCased
    //e.g. - numOfStudents, name, interestRate, 
    //datatypes
    //int - integer - whole number => 3, 2147483647, 102, -11
    //double - decimal nember => 3.33, 0.2, 0.33333, -33.33
    //char - single character inside single quotations => '3', '!', ' '
    //boolean - true or false => true, false
    
    //object/reference datatypes
    //string - characters surrounded wtth double quotations => "skldfjsldk", "cat" "3"
    /*There are other objects in Java that comes with Java and that are custom
    => Objects/class that comes with Java:Scanner, System, etc.Objects
    => Customer classes: Zombie, SpaceInvader, Person, etc.Customer
    */
    final double PI_VALUE = 3.1415;//constants are all capital, multiples words separated by underscore
    String name = "Jinhong";
    int numberOfStudents = 29;
    double avgGPA = 4.0;
    boolean gameOver = false;//or true
    int age = 0;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hi, give me your name: ");
    name = input.next();//.next()is for String types
    System.out.println("Hi " + name);
    System.out.println("How old are you?");
    age = input.nextInt();
    if(age<20)
    System.out.println(" www  " + age  + "  so young");
    else 
      System.out.println(age+ " !  you are man now");
    /*Arithmetic Operators
      + addition
      - substraction
      * multiplication
      / division
      = assignment operator, equals
      % modulus, remainder, e.g. 10 % 2  ==> 10/2 and then finding remander, which is 0
      
      Programming math operation follow the same order of operations as in Math
      (),exponents, multiplication OR division, addition OR substraction
      from left to right
      */
    int month = age * 12;
    int days = age * 365;
    int hours = days* 24;
    
    System.out.println("YOU are "+ month + " months old OR " + days + "  days old OR " + hours + "  hours old");
    //double for user input is input.nextDouble();
    String job = " ";
    Scanner 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}