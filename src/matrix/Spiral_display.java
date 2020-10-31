package matrix;

//1. You are given a number n, representing the number of rows.
//2. You are given a number m, representing the number of columns.
//3. You are given n*m numbers, representing elements of 2d array a.
//4. You are required to traverse and print the contents of the 2d array in form of a spiral.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Spiral_display {
    public static void main(String[] args) throws Exception {
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

        int minr = 0, minc = 0;
        int maxr = arr.length-1, maxc = arr[0].length-1;

        int total_element = m * n;
        int count = 0;

        while(count < total_element){
            //left wall
            for(int i = minr, j = minc; i <= maxr && count < total_element; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottom wall
            for(int i = maxr, j = minc; j <= maxc && count < total_element; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            //right wall
            for(int i = maxr, j = maxc; i >= minr && count < total_element; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            //top wall
            for(int i = minr, j = maxc; j >= minc && count < total_element; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }


    }
}
