/*
  JinHong Cen
  Co sci290
  5.10 (Find numbers divisible by 5 and 6) 
  Write a program that displays all the numbers from 100 to 1,000, ten per line, 
  that are divisible by 5 and 6. Numbers are separated by exactly one space.
*/
public class Findnumbers{
  public static void main(String[] args){
    int j =0;
    for(int i =100;i<1000;i++)
      if(i%5==0 && i%6==0){
        
        j++;
        if(j%10==0){
          j=0;
          j++;
          System.out.println(i+" ");
        }
        System.out.print(i+" ");
      }
  }
}