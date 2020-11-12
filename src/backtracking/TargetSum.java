package backtracking;

//1. You are given a number n, representing the count of elements.
//2. You are given n numbers.
//3. You are given a number "tar".
//4. Complete the body of printTargetSumSubsets function - without changing signature
//   - to calculate and print all subsets of given elements, the contents of which sum to "tar".
//   Use sample input and output to get more idea.

//Sample Input
//
//        5
//        10
//        20
//        30
//        40
//        50
//        60
//
//Sample Output
//
//        10, 20, 30, .
//        10, 50, .
//        20, 40, .

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TargetSum {
    public static void main(String[] args) throws Exception {
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
        arr[i] = Integer.parseInt(br.readLine());
    int d = Integer.parseInt(br.readLine());

    printTargetSumSubsets(arr, 0, "", 0, d);
}

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set + ".");
            }
            return;
        }

        printTargetSumSubsets(arr, idx+1, set + arr[idx] + ", ",  sos + arr[idx], tar);
        printTargetSumSubsets(arr, idx+1, set,  sos, tar);
    }
}
