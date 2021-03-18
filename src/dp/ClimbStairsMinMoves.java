package dp;

//1. You are given a number n, representing the number of stairs in a staircase.
//2. You are on the 0th step and are required to climb to the top.
//3. You are given n numbers, where ith element's value represents - till how far from the step you
//   could jump to in a single move.  You can of-course fewer number of steps in the move.
//4. You are required to print the number of minimum moves in which you can reach the top of
//   staircase.
//Note -> If there is no path through the staircase print null.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClimbStairsMinMoves {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;
        // n to n there is 1 path but 0 moves to reach that path coz we are there only

        for(int i = n-1; i >= 0; i--){
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;
                for(int j = 1; j <= arr[i] && (i+j) < dp.length; j++){
                    if(dp[i + j] != null){
                        min = Math.min(min, dp[i+j]);
                    }
                }

                if(min != Integer.MAX_VALUE){
                    dp[i] = min + 1;
                }
            }
        }

        System.out.println(dp[0]);
    }

}

// Must watch -> https://www.youtube.com/watch?v=Zobz9BXpwYE