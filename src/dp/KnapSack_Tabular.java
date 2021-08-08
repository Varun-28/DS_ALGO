package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// } Driver Code Starts

public class KnapSack_Tabular {

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

            String st[] = read.readLine().split(" ");

            //inserting the values
            for(int i = 0; i < n; i++)
                val[i] = Integer.parseInt(st[i]);

            String s[] = read.readLine().split(" ");

            //inserting the weigths
            for(int i = 0; i < n; i++)
                wt[i] = Integer.parseInt(s[i]);

            //calling method knapSack() of class Knapsack
            System.out.println(new Solution_KnapSack_Tabular().knapSack(w, wt, val, n));
        }
    }
}

// } Driver Code Ends

class Solution_KnapSack_Tabular
{
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n)
    {
        // your code here
        int[][] t = new int[n+1][W+1];

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                // initialization
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
                // tabulization
                else if(wt[i - 1] <= j){
                    //if current weight can be added to knapsack
                    t[i][j] = Math.max(
                            //taking current value
                            val[i - 1] + t[i - 1][j - wt[i - 1]],
                            //not taking current value
                            t[i - 1][j]
                    );
                }else{
                    //if current weight cannot be added to knapsack
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][W];
    }

}

// Problem -> https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1



