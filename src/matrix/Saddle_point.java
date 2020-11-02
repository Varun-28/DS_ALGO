package matrix;

//1. You are given a number n, representing the number of rows
//   and columns of a square matrix.
//2. You are given n * n numbers, representing elements of 2d array a.
//3. You are required to find the saddle point of the matrix which is
//   defined as the value which is smallest in it's row but largest in it's column.
//
//Note - There can be only 1 saddle point or none. Think why?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Saddle_point {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for(int i = 0; i < arr.length; i++){

            int sjv = 0; // smallest j value
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] < arr[i][sjv]){
                    sjv = j;
                }
            }

            boolean flag = true;
            for(int k = 0; k < arr.length; k++){
                if(arr[k][sjv] > arr[i][sjv]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(arr[i][sjv]);
                return;
            }
        }

        System.out.println("Invalid input");
    }
}
