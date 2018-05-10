/*
  JinHong Cen
  CO-SCI 290
  Here's a goofy programming problem that was made for the purpose of testing how well you understand arrays, modulus, and control structures like if-else and loops:

  Write a program that has two arrays with size of as many letters there are in your first name. Randomly assign integers to each index in each array. Be sure to make this random integer generator a separate custom function that is called within main method.

  Go through each array and count how many odd numbers there are and then count how many even numbers there are. Be sure to create a custom function that returns whether a number is even or odd.

  Create two new arrays, one called even and the other called odd, each of these arrays will have the array size of their respective counters from above.

  Fill the odd array with the odd numbers and then fill the even array with even numbers. 

  Then iterate through each array and output the values.
*/

import java.util.*;
public class Quiz2{
  public static void main(String[] args){

    int n;   
    int m;
    int[] a =getnumber(7);
    int[] b =getnumber(7);
    n = coutodd(a,b);
    m = couteven(a,b);
    int[] odd = new int[n];
    int[] even = new int[m];
    odd = getodd(a,b,n);
    even = geteven(a,b,m);
    System.out.println("Two arrays has "+ n +"odd numbers and have "+ m+" even numbers.");
    for(int i=0;i<odd.length;i++){
      System.out.print(odd[i]+" ");
    }
    for(int i=0;i<even.length;i++){
      System.out.print(even[i]+" ");
    }
   }
  
  public static int[] getnumber(int n){
    int[] z =new int[7];
   for(int i=0;i<z.length;i++){
    int w = 1 + (int)(Math.random()*(1000-1));
     z[i] = w;
   }
    return z;
   }
  public static int coutodd(int[] x,int[] z){
    int o=0;
    for(int re=0;re<x.length;re++){
      if(x[re]%2==1){
        o++;
      }
      
     for(int i=0;i<z.length;i++){
      if(z[i]%2==1){
        o++;
      }
     }
    
    return o;
  }
  }
    public static int[] getodd(int[] odds,int[] even,int p){
      int o=0;
    int[] qw =new int[p];
    for(int i=0;i<odds.length;i++)
      if(odds[i]%2==1){
        qw[i]=odds[i];
        o++;
      }
      for(int i=0;i<even.length;i++){
        if(even[i]%2==1){
        qw[i+o]=even[i];
        
      }
    return qw;
  }
    }
  
  public static int couteven(int[] s,int[] ki){
    int e=0;
    for(int i=0;i<s.length;i++)
      if(s[i]%2==0){
        e++;
      }
   for(int i=0;i<ki.length;i++){
      if(ki[i]%2==0){
        e++;
      }
     
   }
    return e;
  } 
      public static int[] geteven(int[] odds,int[] even,int p){
        int o=0;
    int[] qq =new int[p];
    for(int i=0;i<odds.length;i++)
      if(odds[i]%2==0){
        qq[i]=odds[i];
        o++;
      }
      for(int i=0;i<even.length;i++){
        if(even[i]%2==0){
        qq[i+o]=even[i];
        
      }
      }
    return qq;
  
  }
      
      
  
  }
  

