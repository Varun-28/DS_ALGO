package dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(fibMemorized(n, new int[n+1]));
    }
    public static int fibMemorized(int n, int[] memo){
        if(n == 0 || n == 1){
            return n;
        }

        if(memo[n] != 0){
            return memo[n];
        }

        int fib = fibMemorized(n-1, memo) + fibMemorized(n-2, memo);

        memo[n] = fib;
        return fib;
    }
}
