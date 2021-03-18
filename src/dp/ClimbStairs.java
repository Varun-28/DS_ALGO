package dp;

//1. You are given a number n, representing the number of stairs in a staircase.
//2. You are on the 0th step and are required to climb to the top.
//3. In one move, you are allowed to climb 1, 2 or 3 stairs.
//4. You are required to print the number of different paths via which you can climb to the top.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ClimbStairs {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(stairsMemorized(n, new int[n+1]));
        System.out.println(stairsTabular(n));
    }

    public static int stairsMemorized(int n, int[] memo){
        //recursive
        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }

        if(memo[n] != 0) return memo[n];

        int path1 = stairsMemorized(n - 1, memo);
        int path2 = stairsMemorized(n - 2, memo);
        int path3 = stairsMemorized(n - 3, memo);
        int stairsSum = path1 + path2 + path3;

        memo[n] = stairsSum;
        return stairsSum;
    }

    public static int stairsTabular(int n){
        //iterative
        int[] dp = new int[n+1];

        dp[0] = 1;

        for(int i = 1; i <= n; i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        return dp[n];
    }
}

// Must watch -> https://www.youtube.com/watch?v=A6mOASLl2Dg&feature=youtu.be