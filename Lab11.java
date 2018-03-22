/*
  JinHong Cen
  Co sei290
  Do this problem in the book:

  6.17 (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following header:

  public static void printMatrix(int n)

  Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to enter n and displays an n-by-n matrix.
*/
import java.util.*;
public class Lab11{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What n-by-n matrix you want,Enter your number.");
    int n = input.nextInt();
    int m=0;
    for(int i =0;i<n;i++)
      for(int j =0;j<n;j++){
        m++;
       int y =0 + (int)(Math.random()*(2-0));
        System.out.print(y +" ");
        if(m==n){
          m=0;
          System.out.print("\n");
        }
      }
  }
  
  
  
  
}