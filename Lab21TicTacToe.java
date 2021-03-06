/*
  Author: < JinHong Cen>
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class Lab21TicTacToe{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                          };
  static int nowinner = 0;//cout 
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
      
      if(nowinner == 9){
        gameOver = true;
        System.out.println("no winner!!");
        break;
      }
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
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
        if(T<=2){
          System.out.print("  |  ");
          
        }
        if(T==3&&r<=1){
          r++;
          System.out.print("\n-------------");
          
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
    if((board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][1]!=' ')|| (board[1][0]==board[1][1] && board[1][1]==board[1][2] && board[1][1]!=' ') || (board[2][0]==board[2][1] && board[2][1]==board[2][2] && board[2][0]!=' ') ){
      return true;
    }
    if((board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[0][0]!=' ') || (board[0][1]==board[1][1] && board[1][1]==board[2][1] && board[1][1]!=' ') || (board[0][2]==board[1][2] && board[1][2]==board[2][2] && board[0][2]!=' ')){
      return true;
    }
    if((board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[2][2]!=' ') || (board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[2][0]!=' ')){
      return true;
    }

    
    return false;
    
  }//end of checkWinner
  
  
}//end class