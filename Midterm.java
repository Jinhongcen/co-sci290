/*
  JinHong Cen
  Co sei290
  
  
  Modify your last lab of printing an n-by-n matrix (maintain the feature that n is given by the user) to print out random numbers from 0 to 10. 
  Write a test program that prints out two random matrices instead of the one. 
  Do matrix addition on these two matrices and print out the resulting matrix. 
  Bonus (20 points):

  Do matrix multiplication on the two matrices from above and print out the resulting matrix. 
*/

import java.util.*;
public class Midterm{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What n-by-n matrix you want,Enter your number.");
    int n = input.nextInt();
    System.out.println("\nOk,now print two matrix!");
    int m=0,k=0,c=0;
    int[] q = new int[n*n];
    int[] w = new int[n*n];
    String str1;
    String str2;
    for(int i =0;i<n;i++)
      for(int j =0;j<n;j++){
        if(m==0){
          System.out.print("|  ");
        }
        m++;
       int y =0 + (int)(Math.random()*(11-0));
        
        q[k]=y;
         k++;
        if(y==10){
          System.out.print(y+"  ");
        }
        else{
        System.out.print(y+"   ");
          
        }
        if(m==n){
          m=0;
          System.out.print("|\n");
        }
      }
   
          System.out.println("\n******Scond******\n");
     for(int i =0;i<n;i++)
      for(int j =0;j<n;j++){
          if(m==0){
          System.out.print("|  ");
        }
        m++;
        int y =0 + (int)(Math.random()*(11-0)); 
        w[c]=y;
        c++;
        if(y==10){
          System.out.print(y+"  ");
        }
        else{
        System.out.print(y+"   ");
          
        }
        if(m==n){
          m=0;
          System.out.print("|\n");
        }
      }
    int[] v=new int[n*n];
    for(int i=0;i<n*n;i++)
      v[i]=q[i]+w[i];
    
    System.out.println("\nmatrix addition on these two matrices and print out the resulting matrix");
    for(int i=0;i<n*n;i++){
        if(m==0){
          System.out.print("|  ");
        }
      m++;

      if(v[i]>=10){
          System.out.print(v[i]+" ");
        }
        else{
        System.out.print(v[i]+"  ");
      }
      
            
    if(m==n){
        m=0;
        System.out.print("|\n");
      }
      
   }
  
    for(int i=0;i<n*n;i++)
      v[i]=q[i]*w[i];
    
    System.out.println("\nmatrix multiplication on these two matrices and print out the resulting matrix");
    for(int i=0;i<n*n;i++){
        if(m==0){
          System.out.print("|  ");
        }
      m++;

      if(v[i]>=10){
          System.out.print(v[i]+" ");
        }
        else{
        System.out.print(v[i]+"  ");
      }
      
            
    if(m==n){
        m=0;
        System.out.print("|\n");
      }
      
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
  
  } 
}