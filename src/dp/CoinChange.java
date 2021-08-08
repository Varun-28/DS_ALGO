package dp;

import java.util.Scanner;

public class CoinChange {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int Arr[] = new int[m];
            for(int i = 0;i<m;i++)
                Arr[i] = sc.nextInt();
            System.out.println(countCoin(Arr,m,n));
        }
    }
    public static long countCoin(int S[], int m, int n)
    {
        long[][] t = new long[m + 1][n + 1];

        for(int i = 0; i <= n; i++)
            t[0][i] = 0;

        for(int i = 0; i <= m; i++)
            t[i][0] = 1;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(S[i - 1] <= j){
                    t[i][j] = t[i - 1][j] + t[i][j - S[i - 1]];
                }else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[m][n];
    }
}


/*
Given a value N, find the number of ways to make change for N cents,
if we have infinite supply of each of S = { S1, S2, .. , SM } valued coins.

Input:
n = 4 , m = 3
S[] = {1,2,3}
Output: 4
Explanation: Four Possible ways are:
{1,1,1,1},{1,1,2},{2,2},{1,3}.

 */