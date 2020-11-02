package matrix;

//1. You are given a number n, representing the number of rows of a matrix.
//2. You are given a number m, representing the number of columns of a matrix.
//3. You are given n * m numbers, representing elements of 2d array a.
//4. You are given a shell number s. For details check image.
//5. You are given a number r, representing number of anti-clockwise
//   rotations (for +ve numbers) of the shell s.
//6. You are required to rotate the sth shell of matrix by r rotations and
//   display the matrix using display function.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Shell_rotate {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }

        int s = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        shellrotate(arr, s, r);
        display(arr);
    }

    public static void shellrotate(int[][] arr, int s, int r) {
        int[] larr = fillLinear(arr, s);
        rotate(larr, r);
        fill2d(arr, larr, s);
    }

    public static int[] fillLinear(int[][] arr, int s) {

        int rmin = s - 1;
        int cmin = s - 1;
        int rmax = arr.length - s;
        int cmax = arr[0].length - s;

        int sz = 2*(rmax - rmin + cmax - cmin);
        // 2*(rmax - rmin + 1) + 2*(cmax - cmin + 1) - 4;

        int[] larr = new int[sz];

        // left wall
        int idx = 0;
        for (int i = rmin; i <= rmax; i++) {
            larr[idx] = arr[i][cmin];
            idx++;
        }

        // bottom wall
        for (int j = cmin + 1; j <= cmax; j++) {
            larr[idx] = arr[rmax][j];
            idx++;
        }

        // right wall
        for (int i = rmax - 1; i >= rmin; i--) {
            larr[idx] = arr[i][cmax];
            idx++;
        }

        // top wall
        for (int j = cmax - 1; j >= cmin + 1; j--) {
            larr[idx] = arr[rmin][j];
            idx++;
        }

        return larr;
    }

    public static void fill2d(int[][] arr, int[] larr, int s) {
        int rmin = s - 1;
        int cmin = s - 1;
        int rmax = arr.length - s;
        int cmax = arr[0].length - s;

        // left wall
        int idx = 0;
        for (int i = rmin; i <= rmax; i++) {
            arr[i][cmin] = larr[idx];
            idx++;
        }

        // bottom wall
        for (int j = cmin + 1; j <= cmax; j++) {
            arr[rmax][j] = larr[idx];
            idx++;
        }

        // right wall
        for (int i = rmax - 1; i >= rmin; i--) {
            arr[i][cmax] = larr[idx];
            idx++;
        }

        // top wall
        for (int j = cmax - 1; j >= cmin + 1; j--) {
            arr[rmin][j] = larr[idx];
            idx++;
        }
    }

    public static void rotate(int[] larr, int r) {
        r = r % larr.length;
        if (r < 0) {
            r += larr.length;
        }

        reverse(larr, 0, larr.length - 1 - r);
        reverse(larr, larr.length - r, larr.length - 1);
        reverse(larr, 0, larr.length - 1);
    }

    public static void reverse(int[] arr, int i1, int i2) {
        int li = i1;
        int ri = i2;
        while (li < ri) {
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;

            li++;
            ri--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
