package backtracking;

//1. You are given a number n, the size of a chess board.
//2. You are required to place n number of queens in the n * n cells of board such that no
//   queen can kill another.
//   Note - Queens kill at distance in all 8 directions
//3. Complete the body of printNQueens function

//Sample Input
//
//        4
//
//Sample Output
//
//        0-1, 1-3, 2-0, 3-2, .
//        0-2, 1-0, 2-3, 3-1, .

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NQueens {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        printNQueens(arr,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length){
            System.out.println(qsf + ".");
            return;
        }



        for(int col = 0; col < chess.length; col++){
            if(QueenIsSafe(chess, row, col) == true){
                chess[row][col] = 1;
                printNQueens(chess,qsf + row + "-" + col + ", ",row+1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean QueenIsSafe(int[][] chess, int row, int col){

        for(int i = row-1 , j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row-1 , j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row-1 , j = col+1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }

        return true;
    }
}
