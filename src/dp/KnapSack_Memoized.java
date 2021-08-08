package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// { Driver Code Starts

class KnapSack_Memoized
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        //reading total testcases
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());

            int val[] = new int[n];
            int wt[] = new int[n];

            String st[] = read.readLine().trim().split("\\s+");

            //inserting the values
            for(int i = 0; i < n; i++)
                val[i] = Integer.parseInt(st[i]);

            String s[] = read.readLine().trim().split("\\s+");

            //inserting the weigths
            for(int i = 0; i < n; i++)
                wt[i] = Integer.parseInt(s[i]);

            //calling method knapSack() of class Knapsack
            System.out.println(new Solution_KnapSack_Memoized().knapSack(w, wt, val, n));
        }
    }
}

// } Driver Code Ends

class Solution_KnapSack_Memoized
{
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int[][] t = new int[n+1][W+1];

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                t[i][j] = -1;
            }
        }

        return myKnapsack(W, wt, val, n, t);
    }

    static int myKnapsack(int W, int wt[], int val[], int n, int[][] t){
        //base case
        if(n == 0 || W == 0) return 0;

        //Choice diagram + memoization

        if(t[n][W] != -1) return t[n][W];

        if(wt[n-1] <= W){
            //if knapsack can take that weight
            return t[n][W] = Math.max(
                    //taking current value
                    val[n-1] + myKnapsack(W - wt[n-1], wt, val, n-1, t),
                    //not taking current value
                    myKnapsack(W, wt, val, n-1, t)
            );
        }else{
            //if knapsack cannot take that weight
            return t[n][W] = myKnapsack(W, wt, val, n-1, t);
        }
    }
}

// Problem -> https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

