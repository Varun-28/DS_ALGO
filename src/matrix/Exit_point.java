package matrix;

//1. You are given a number n, representing the number of rows.
//2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers (1's and 0's), representing elements
//   of 2d array a.
//4. Consider this array a maze and a player enters from top-left
//   corner in east direction.
//5. The player moves in the same direction as long as he meets '0'.
//   On seeing a 1, he takes a 90 deg right turn.
//6. You are required to print the indices in (row, col) format of
//   the point from where you exit the matrix.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exit_point {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int i = 0, j = 0, dir = 0;
        //0 -> east, 1 -> south, 2 -> west, 3 -> north

        while(true){

            dir = (dir + arr[i][j])%4;

            if(dir == 0){
                j++; //move east by increasing column
            }else if(dir == 1){
                i++; //move south by increasing row
            }else if(dir == 2){
                j--; //move west by decreasing column
            }else if(dir == 3){
                i--; //move north by decreasing row
            }

            if(i < 0){
                i++;
                break;
            }else if(j < 0){
                j++;
                break;
            }else if(i == arr.length){
                i--;
                break;
            }else if(j == arr[0].length){
                j--;
                break;
            }

        }

        System.out.print(i + "\n" + j);
    }
}
