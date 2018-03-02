/*
  JinHong cen
  Co Sci 290
*/
import java.util.Scanner;
public class Lab1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int i=0;
    System.out.println("Input a number between 0-9!");
    i = input.nextInt();
    while(i<0 || i>9)
    {
    System.out.println("you give a wrong number!!Please input number again,between 0-9!");
    i = input.nextInt();
    }
    
    System.out.println("You got "+i+" guns");
    
    
  }
}