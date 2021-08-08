package dp;

public class Count_SubsetSum {

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
        int set[] = { 2, 3, 5, 8, 10, 6 };
        int sum = 10;
        int n = set.length;
        System.out.println("Number of Subset with given sum : " + countSubsetSum(set, n, sum));
    }
}

//Number of subset that give sum 10 are : 3
//    i.e;  {2, 3, 5}, {2, 8}, {10}
