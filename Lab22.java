/*
  Author: < JinHong Cen>
  
  Modify the Tic Tac Toe program to a 6 x 6 character array that now functions as a game of Connect 4!
  
*/

import java.util.*;

public class Lab22{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' '},
                          };
  static int noWinner = 0;
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    
    System.out.println("Let's play Tic Tac Toe!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      
      if(noWinner == 36){
        gameOver = true;
        System.out.println("no winner!!");
        break;
      }
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2, 3, 4, 5 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2, 3, 4, 5 for col");
      col = input.nextInt();
      move(row, col);
      changeXO();
      if(checkWinner()){
        gameOver = true;
        printBoard();
        changeXO();
        System.out.println("Winner is " + xo );
      }
    }
    
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
    int T=0;
    int r=0;
    for(int i =0;i<board.length;i++){
      T=0;
      for(int j = 0;j<board[i].length;j++){
         T++;
         System.out.print(board[i][j]);
        if(T<=5){
          System.out.print(" | ");
          
        }
        if(T==6&&r<=4){
          r++;
          System.out.print("\n---------------------");
          
        }
        
      }
      
      System.out.print("\n");
    }
 
  }//end of printBoard
  
  public static void changeXO(){
    if(xo=='o'){
      xo='x';
    }
    else{
      xo='o';
    }

    
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int row, int col){
    if(board[row][col]==' '){
    board[row][col]=xo;
      nowinner++;
    }
    else{
      System.out.println("You put in wrong row and col,try again");
      
      changeXO();
    }
    
    
  }//end of move
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
    for(int j=0;j < board.length;j++)
      for(int i=0;i <=2;i++){
    if((board[j][i] == board[j][i+1] && board[j][i+1] == board[j][i+2] && board[j][i+2] == board[j][i+3]) && board[j][i+1]!=' '){
      return true;
    }
    }
    for(int j=0;j <board.length;j++)
      for(int i=0;i <=2;i++){
    if((board[i][j] == board[i+1][j] && board[i+1][j] == board[i+2][j] && board[i+2][j] == board[i+3][j]) && board[i+1][j]!=' '){
      return true;
    }
      }
      for(int i=0;i<=2;i++)
        for(int j=0;j<=2;j++){
          if((board[i][j] == board[i+1][j+1] && board[i+1][j+1]== board[i+2][j+2] && board[i+2][j+2]==board[i+3][j+3]) && board[i][j]!=' '){
            return true;
          }
        }
    

    
    return false;
    
  }//end of checkWinner
  
  
}//end class