//EASY
package array;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are required to print a bar chart representing value of arr a.
//
//        Sample Input
//
//        5
//        3
//        1
//        0
//        7
//        5
//
//        Sample Output
//
//                  *
//                  *
//                  *   *
//                  *   *
//        *			*	*
//        *			*	*
//        *  *  	*	*

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BarChart {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int floor = max; floor >= 1; floor--){
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
