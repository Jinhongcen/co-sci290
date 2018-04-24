/* 
  JinHong Cen
  Co sci 290
  5.13 (Find the largest n such that n3 < 12,000) Use a while loop to find the largest integer n such that n3 is less than 12,000.
*/
class Lab15{
  public static void main(String[] args){
    int i=0;
    int n=0;
    while(i==0){
      if(n*n*n<12000){
        n++;
      }
      else{
        i=1;
        System.out.println("the largest n such that n3 < 12,000"+" n = "+ (n-1));
      }
    }
  }
}