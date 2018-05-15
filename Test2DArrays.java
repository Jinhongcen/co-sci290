/*
  Author: Sina
  jinhong cen
  Purpose : test 2d arrays
*/
public class Test2DArrays{
  //mian method
  public static void main(String[] args){
    
    //declare 2D arrays
    String[][] words = new String[3][2];
    /*
    {
    {null,null},
    {null,null},
    {null,null}
    }
    */
    //assign first element in 2d arrays
    words[0][0] = "cat";
    
    //get element in 2d arrays
    System.out.println(words[0][0]);
    System.out.println(words[0][1]);
    
    //iterate through array and assign values using loops
    for(int i = 0; i < words.length; i++){
      for(int j = 0;j < words[i].length; j++){
        words[i][j] = i * j +" cats";//assign
        System.out.println(words[i][j]);
      }
    }
    System.out.println(print2DArray(words));
    
    
    
  }//end main
  
  //this method concatenates all elements in a 2d arrays
  public static String print2DArray(String[][] array){
    String concat = "";
     for(int i = 0; i < array.length; i++){
      for(int j = 0;j < array[i].length; j++){
        concat = concat + array[i][j] + " ";
        
      }
    }
    return concat;
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}//end classs