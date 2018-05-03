/*
  jinhong cen
  Co sci 290
  Write a method that finds the smallest element in an array of double values using the following header:
public static double min(double[] array)
Write a test program that prompts the user to enter ten numbers, invokes this
method to return the minimum value, and displays the minimum value.
*/
import java.util.*;
public class Lab18{
  public static void main(String[] args){
  double[] myList =  new double[10];////declare an array
  Scanner input = new Scanner(System.in);
  System.out.println("Enter 10 number and separate them with Spaces,i will find out the smallest element");
    for(int i=0;i<myList.length;i++){
  myList[i] = input.nextDouble();
    }
  double a;
  a=min(myList);
    System.out.println("The smallest element is "+a);
  }
  public static double min(double[] array){
  double b;
  b=array[0];
  for(int i=1;i<array.length;i++)
    if(b>array[i]){
      b=array[i];
    }
  return b;
  }
}