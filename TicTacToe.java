import java.util.*;

public class TicTacToe{
   public static void main(String[] args){
      int player = 0;   //keeps whose turn it is
      int moveCounter = 0; //keeps track of how many moves have been done
      int xCoor, yCoor; //input variables for coordinate system
      char[][] board = new char[3][3]; /*       { , , }     0,0   0,1   0,2
                                                { , , }     1,0   1,1   1,2
                                                { , , }     2,0   2,1   2,2         */ 
      Scanner sc = new Scanner(System.in); //Scanner used for our input coordiantes 
      
      for(int s=0;s<=2;s++){     //nested for loop for starting the board with empty _ spaces.
         for(int t=0;t<=2;t++){
            board[s][t]='_';
         }
      }
      
      while(moveCounter < 9){    //Continued loop until 9 moves have been played
         for(int i=0;i<=2;i++){  //updating our board to show what has changed since last loop
            for(int j=0;j<=2;j++){
               System.out.print(board[i][j]+" ");
            }
            System.out.println();
         }
         
         System.out.println("Please enter the X coordinate between 0 and 2:");
         xCoor = sc.nextInt();   //x-coordinate
         System.out.println("Please enter the Y coordinate between 0 and 2:");
         yCoor = sc.nextInt();   //y-coordinate
         
         if(xCoor>2 || xCoor<0 || yCoor>2 || yCoor<0){ //checking for out of bounds entries.
            System.out.println("Sorry, those coordinates are out of bounds. Try again.");
         }
         else{
            if(board[xCoor][yCoor]=='_'){
               if(player == 0){   //checking whose turn it is
                  board[xCoor][yCoor]='X';   //placing X in the select Coordinates
                  player++;   //swapping player
                  moveCounter++; 
               }
               else{
                  board[xCoor][yCoor]='O';
                  player--;
                  moveCounter++;
               }
            }
            else{
               System.out.println("Sorry, That location is occupied. Try again.");
            }
         }
      }
      
      for(int i=0;i<=2;i++){    //last update to the board.
         for(int j=0;j<=2;j++){
            System.out.print(board[i][j]+" ");
         }
         System.out.println();
      }
      
   }
}