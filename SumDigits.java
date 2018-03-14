/*
   Co sei 290
   Jinhong cen
*/
import java.util.Scanner;
public  class SumDigits{
  public static int sumDigits(long n){
   int i,sum,j,e,l;
    sum = 0;
    i =1;
    e = 1;
    while(i>0){
      
      sum += (int)(n/e)%10;
      e = e*10;
      i = (int)n/e;
    
       }
  return sum;
  }


  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    int Sum;
   System.out.println("Input you number,i will give the Sum the digits in an integer");
   long i = input.nextLong();
   Sum = sumDigits(i);
   System.out.println("Number Sum = " + Sum);
}





}