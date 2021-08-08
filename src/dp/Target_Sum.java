package dp;

public class Target_Sum {

    static int countSubsetDiff(int set[], int diff){
        int range = 0;
        for(int i : set){
            range += i;
        }
        int sum = (diff + range)/2;

        return countSubsetSum(set, set.length, sum);
    }

    static int countSubsetSum(int set[], int n, int sum) {

        int subset[][] = new int[n + 1][sum + 1];

        for (int i = 0; i <= sum; i++)
            subset[0][i] = 0;

        for (int i = 0; i <= n; i++)
            subset[i][0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if(set[i - 1] <= j){
                    subset[i][j] = subset[i - 1][j]
                            + subset[i - 1][j - set[i - 1]];
                }else{
                    subset[i][j] = subset[i - 1][j];
                }
            }
        }
        return subset[n][sum];
    }

    /* Driver code*/
    public static void main(String args[])
    {
        int set[] = { 1, 2, 1, 3 };
        int target = 1;
        System.out.println("Number of subet with target sum : " + countSubsetDiff(set, target));
    }
}
/*
Problem Statement :
You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before
each integer in nums and then concatenate all the integers.

    For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and
    concatenate them to build the expression "+2-1".

Return the number of different expressions that you can build, which evaluates to target.
 */

/*
Approach :
set = [ 1, 1, 2, 3]
sum = 1

 + 1 - 1 - 2 + 3 = 1
 or
 (1 + 3) - (1 + 2) = 1

 So we have two subset having difference 1.

 The problem became same as count subset difference.
 */
