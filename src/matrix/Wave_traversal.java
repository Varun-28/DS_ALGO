package matrix;

//1. You are given a number n, representing the number of rows.
//2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers, representing elements of 2d array a.
//4. You are required to traverse and print the contents of the 2d
//array in form of a wave - down the first column then up the second column and so on.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Wave_traversal {
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

        for(int j = 0; j < m; j++){
            if(j%2==0){
                for(int i = 0; i < n; i++){
                    System.out.println(arr[i][j]);
                }
            }else{
                for(int i = n-1; i >= 0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}

