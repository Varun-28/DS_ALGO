package matrix;

//1. You are given a number n, representing the number of rows and
//columns of a square matrix.
//2. You are given n * n numbers, representing elements of
//2d array a.
//3. You are required to diagonally traverse the upper half of
//the matrix and print the contents.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Diagonal_traverse {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int ni = n;
        int nj = 0;
        int repeat = 0;
        int i, j;
        while(repeat < n){
            for(i = 0, j = nj; i < ni && j < n; i++, j++){
                System.out.println(arr[i][j]);
            }
            ni--;
            nj++;
            repeat++;
        }

        //method 2

//        for(int g = 0; g < arr.length; g++){
//            for(int i = 0, j = i + g; j < arr.length; i++, j++){
//                System.out.println(arr[i][j]);
//            }
//        }

    }
}
