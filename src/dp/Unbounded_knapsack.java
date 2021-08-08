package dp;

// Also known as Rod cutting problem

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// } Driver Code Starts
public class Unbounded_knapsack {

    public static void main(String args[])throws IOException{

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            int val[] = new int[n];
            int wt[] = new int[n];

            String st[] = read.readLine().split(" ");
            for(int i = 0; i < n; i++)
                val[i] = Integer.parseInt(st[i]);

            String s[] = read.readLine().split(" ");
            for(int i = 0; i < n; i++)
                wt[i] = Integer.parseInt(s[i]);

            System.out.println(new Solution_Unbounded_knapsack().knapSack(w, wt, val, n));
        }
    }
}
// } Driver Code Ends

class Solution_Unbounded_knapsack
{
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n){

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
                            val[i - 1] + t[i][j - wt[i - 1]],
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

// Explaination Video -> https://www.youtube.com/watch?v=aycn9KO8_Ls&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=13