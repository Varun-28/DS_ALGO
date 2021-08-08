package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// { Driver Code Starts
public class EqualSumPartition {

    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);

            Solution_EqualSumPartition ob = new Solution_EqualSumPartition();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution_EqualSumPartition{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;

        for(int i : arr){
            sum += i;
        }

        if(sum%2 != 0){
            return 0;
        }

        if(isSubsetSum(arr, N, sum/2) == true){
            return 1;
        }else{
            return 0;
        }
    }

    static boolean isSubsetSum(int set[], int n, int sum) {

        boolean subset[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= sum; i++)
            subset[0][i] = false;

        for (int i = 0; i <= n; i++)
            subset[i][0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if(set[i - 1] <= j){
                    subset[i][j] = subset[i - 1][j]
                            || subset[i - 1][j - set[i - 1]];
                }else{
                    subset[i][j] = subset[i - 1][j];
                }
            }
        }

        return subset[n][sum];
    }
}

// Problem -> https://practice.geeksforgeeks.org/problems/subset-sum-problem2014/1