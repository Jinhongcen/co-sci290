/*
  JinHong Cen
  Co Sci 290
  
  Topics:
  -multi-way if-else
  -logical operators
  -symbolic logic
  */

import java.util.Scanner;
public class TestLogic{
   
  //entry point of application
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter your grade:");
       
     int grade = input.nextInt();
     //simple if
     if(grade >= 90){
       System.out.println("A");
     }
     if(grade <90){
       System.out.println("grade is not an A");
     }
     else{
       System.out.println("grade is an A");
     }
     //multi if - else if - else
     if(grade >= 90){
       System.out.println("A");
     }
     else if(grade >= 80){
       System.out.println("B");
     }
     else if(grade >= 70){
       System.out.println("C");
     }
     else{
       System.out.println("F");
     }
    /*
    Logical operators
    ! - NOT
    != - NOT equal to
    == - is equal to?
    && - AND  =>if both is true, the conditional evqluates to true
    || - or =>if either is true , the conditional evaluates to true 
    */
     
     //using if-else, write code that checks whether
     //a student grade is good, average,or bad
    
     if(grade >= 80){
       System.out.println("This is a good grade.");
        if(grade >=90)
     {
       System.out.println("Wow,YOU got an A!");
     }
       
     }
     else if(grade < 80 && grade >= 70){
       System.out.println("This grade is average.");
     }
     else{
       System.out.println("This is a bad grade");
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
   }







































}