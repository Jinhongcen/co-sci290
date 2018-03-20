/* 
   Co sei 290
   JinHong Cen



(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome
*/
import java.util.*;
public class Lab9{
  public static void main(String[] args){
   
	 Scanner input = new Scanner(System.in); 

	 
	 System.out.print("Enter an integer: ");
   int number = input.nextInt();

	 // Report whether the integer is a palindrome.
		if(isPalindrome(number)==true){
	 System.out.println(number + " is "  +
	 "a palindrome.");
		}
		else{
			System.out.println(number + " is not " + "a palindrome.");
		}
  }
  public static int reverse(int number){
    String r = "";  // Holds reversed number
	  String n = number + ""; // Convert number to string
	  // Reverse string
    System.out.println(n);
    for (int i = n.length() - 1; i >= 0; i--) {
	  r = r+n.charAt(i);
	 }
	 return Integer.parseInt(r); // Return reversed integer
  }
  
  public static boolean isPalindrome(int number) {
	 return number == reverse(number) ? true : false;
	}
  
  
  
  
 }