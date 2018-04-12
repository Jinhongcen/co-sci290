/*
	<<!----- INSERT YOUR NAME HERE ------>>
  JinHong Cen
  CO SEI 290
  
	Lab 12
	Directions:
	1. This application has bugs. Edit my code so that the program compiles and runs.
	2. Comment every line of code.
	3. Add code or modify the code so that the following output is achieved:
	Sample output with odd number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	3
	The number 3 is odd...
	Sample output with even number:
	This program will check if a number is even or odd...
	Please enter in a whole number...
	2
	The number 2 is even...
	
	Note:
	Preserve the indentation of the code. 
	Clean java code has:
	 proper indentation
	 variable declaration at the beginning of the program
	 class name starts with a capital
	 comments that explains the logic
*/
import java.util.*;     //import java package
public class Lab12{

	public static void main(String args[]){    //pay attention format error

	  Scanner input = new Scanner(System.in);   //new Scanner function
	//char num;

	  System.out.println("This program will check if a number"
	  + " is even or odd...");  //print statement

	  System.out.println("Please enter in a whole number...");//System println statement

	  int num = input.nextInt();  //accpet a number from keyboat

	  checkNums(num);   //method called

	}

	public static void checkNums(int n){

	//oops...  still need to implement
    if(n%2==0){
      System.out.println("The number " + n +" is even...");//if ...else   judgment statement
    }
    else{
      System.out .println("The number "+ n +" is odd...");
    }

	}
	
}





















