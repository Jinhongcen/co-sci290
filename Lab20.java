/*
  Co-sci 290
  jinhong cen
  Declare a 2D array of integers with 5 rows and 6 columns. 
  Randomly assign each index an integer between 0 and 100. 
  Create a custom function that takes in a 2D array of integers and finds the sum of each row. 
  Each sum is saved into an array of integers that is returned by the function.
*/
class Lab20{
  public static void main(String[] args){
    int [][] array = new int [5][6];
    int [] s = new int [5];
    for(int i =0;i<array.length;i++)//row
      for(int j=0;j<array[i].length;j++){//columns
        int mynum = 1 + (int)(Math.random()*(100-1));
        array[i][j]=mynum;
      }
     for(int x = 0; x<array.length; x++){  
            for(int y = 0; y<array[x].length; y++){ 
                System.out.print(array[x][y]+" ");  
            }  
            System.out.println("\n");  
        } //println the array 
      
       s = sum(array);//get the sum
       for(int i = 0 ;i < s.length; i++){
         System.out.println("array the sum of " +(i+1) +" row "+"is "+ s[i]);
       }
    
  }//end main
  
  public static int[] sum(int a[][]){
    
    int [] b = new int [a.length] ;
     for(int i =0;i<a.length;i++){
       int sum=0;
      for(int j=0;j<a[i].length;j++){
       sum += a[i][j];
        } 
       b[i]=sum;
     }
    return b;//return sums
  }//end function
  
  
}//end class