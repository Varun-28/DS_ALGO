package dp;

import java.util.ArrayList;

public class Min_SubsetSum_Difference {

    static int Min_Difference(int[] arr){

        int n = arr.length;
        int Range = 0;
        ArrayList<Integer> List = new ArrayList<>();

        for(int i : arr){
            Range += i;
        }
        boolean[][] t = isSubsetSum(arr, n, Range);

        for(int i = 0; i <= Range/2; i++){
            if(t[n][i] == true){
                List.add(i);
            }
        }
        int min = Integer.MAX_VALUE;
        for(Integer i : List){
            min = Math.min(min, Range - (2 * i));
        }

        return min;
    }

    static boolean[][] isSubsetSum(int set[], int n, int sum) {

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

        return subset;
    }

    /* Driver code*/
    public static void main(String args[])
    {
        int set[] = { 1, 2, 7};
        System.out.println("Minimum Subset Sum Difference : " + Min_Difference(set));
    }
}

// Explaination Video -> https://www.youtube.com/watch?v=-GtpxG6l_Mc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=10

// We have to find the minimum difference of subset of give set
// In {1, 2, 7}
// {1, 2} -> 1 + 2 = 3
// {7} -> 7
// difference => 7 - 3 = 4 (which is minimum)