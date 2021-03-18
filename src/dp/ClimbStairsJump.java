package dp;

//1. You are given a number n, representing the number of stairs in a staircase.
//2. You are on the 0th step and are required to climb to the top.
//3. You are given n numbers, where ith element's value represents - till how far from the step you
//   could jump to in a single move.You can of course jump fewer number of steps in the move.
//4. You are required to print the number of different paths via which you can climb to the top.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClimbStairsJump {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n-1; i >= 0; i--){
            for(int j = 1; j <= arr[i] && (i+j) < dp.length; j++){
                dp[i] += dp[i + j];
            }
        }
        System.out.println(dp[0]);
    }
}
//Must Watch -> https://www.youtube.com/watch?v=uNqoQ0sNZCM&feature=youtu.be