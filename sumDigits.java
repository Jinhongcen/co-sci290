/*
   Co sei 290
   Jinhong cen
*/
import java.util.Scanner;
public static class sumDigits(String[] args){
public static int sumDigit(long n){
  int i,sum,j,e,l;
    i =1;
    while(i>0){
      e = 1;
      sum += n/e%10;
      e = 10;
      i = n/e;
    
       }
  return sum;
  }


public static void main(){
  Scanner input = new Scanner(System.in);
  System.out.println("Input you number,i will give the Sum the digits in an integer");
  long i = input.nextLong();
  sumDigit(i);
  System.out.println(sumDigit);
}





}