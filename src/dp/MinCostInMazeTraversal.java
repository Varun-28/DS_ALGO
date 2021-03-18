package dp;

//1. You are given a number n, representing the number of rows.
//2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers, representing elements of 2d array a, which represents a maze.
//4. You are standing in top-left cell and are required to move to bottom-right cell.
//5. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
//6. Each cell has a value that will have to be paid to enter that cell (even for the top-left and bottom-
//   right cell).
//7. You are required to traverse through the matrix and print the cost of path which is least costly.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinCostInMazeTraversal {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(input.split(" ")[j]);
            }
        }

        int[][] dp = new int[n][m];

        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                if(i == arr.length - 1 && j == arr[0].length - 1){
                    dp[i][j] = arr[i][j];
                }else if(i == n-1){
                    dp[i][j] = arr[i][j] + dp[i][j+1];
                }else if(j == m-1){
                    dp[i][j] = arr[i][j] + dp[i+1][j];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j], dp[i][j+1]) + arr[i][j];
                }
            }
        }

        System.out.println(dp[0][0]);
    }

}
