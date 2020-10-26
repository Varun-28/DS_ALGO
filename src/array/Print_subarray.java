//EASY
package array;

//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are required to print all sub arrays of arr. Each sub array should be
//on separate line. For more clarity check out sample input and output.
//Sample Input
//
//        3
//        10
//        20
//        30
//
//        Sample Output
//
//        10
//        10 20
//        10 20	30
//        20
//        20 30
//        30

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print_subarray {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int len = a.length;
        for(int i = 0;  i < len; i++){
            for(int j = i; j < len; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(a[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
