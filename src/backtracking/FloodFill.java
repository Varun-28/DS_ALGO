package backtracking;

//1. You are given a number n, representing the number of rows.
//2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
//4. You are standing in the top-left corner and have to reach the bottom-right corner.
//   Only four moves are allowed 't' (1-step up), 'l' (1-step left), 'd' (1-step down) 'r' (1-step right).
//   You can only move to cells which have 0 value in them. You can't move out of the boundaries
//   or in the cells which have value 1 in them (1 means obstacle)
//5. Complete the body of floodfill function - without changing signature - to print all paths
//   that can be used to move from top-left to bottom-right.

//Sample Input
//
//        8
//        8
//        0 1 0 0 0 0 0 0
//        0 1 0 1 1 1 1 0
//        0 1 0 1 0 0 0 0
//        0 1 0 1 0 1 1 1
//        0 0 0 0 0 0 0 0
//        0 1 0 1 1 1 1 0
//        0 1 0 1 1 1 1 0
//        0 1 0 0 0 0 0 0
//
//Sample Output
//
//        ddddrrttttrrrrrddlllddrrrddd
//        ddddrrdddrrrrr
//        ddddrrrrrrrddd

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FloodFill {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(str.split(" ")[j]);
            }
        }

        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
    }

    public static void floodfill(int[][] maze, int row, int col, String psf, boolean[][] visited){

        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length ||
                maze[row][col] == 1 || visited[row][col] == true){
            return;
        }

        if(row == maze.length - 1 && col == maze[0].length - 1){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        floodfill(maze, row-1, col, psf + 't', visited);
        floodfill(maze, row, col-1, psf + 'l', visited);
        floodfill(maze, row+1, col, psf + 'd', visited);
        floodfill(maze, row, col+1, psf + 'r', visited);
        visited[row][col] = false;
    }
}
