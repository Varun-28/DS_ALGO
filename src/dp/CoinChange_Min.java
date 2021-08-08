package dp;

import java.util.Scanner;

public class  CoinChange_Min {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int size = sc.nextInt();
            int Arr[] = new int[size];
            for(int i = 0;i<size;i++)
                Arr[i] = sc.nextInt();
            System.out.println(findMinCoin(Arr,size,n));
        }
    }
    public static int findMinCoin(int S[], int size, int n)
    {
        int[][] t = new int[size + 1][n + 1];

        for(int i = 0; i <= size; i++)
            t[i][0] = 0;

        for(int i = 0; i <= n; i++)
            t[0][i] = Integer.MAX_VALUE - 1;

        for(int i = 1; i <= n; i++) {
            if(i%S[0] == 0){
                t[1][i] = i/S[0];
            }else{
                t[1][i] = Integer.MAX_VALUE - 1;
            }
        }

        for(int i = 2; i <= size; i++){
            for(int j = 1; j <= n; j++){
                if(S[i - 1] <= j){
                    t[i][j] = Math.min(t[i - 1][j] , t[i][j - S[i - 1]] + 1);
                }else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[size][n];
    }
}

/*

Given a value N, find the minimum number of coins to make change for N cents.

Input:
n = 4 , size = 3
S[] = {1,2,3}
Output: 2
Explanation: Minimum number of coins can in following ways and the count of coin is 2:
{2,2} or {1,3}.

 */

// Explanation video => https://www.youtube.com/watch?v=I-l6PBeERuc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=16