package dp;

public class Count_Subset_Difference {

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
        int diff = 1;
        System.out.println("Number of Subset with given difference : " + countSubsetDiff(set, diff));
    }
}
/*
Let there be two subset S1 and S2 of given set
A/Q :-
    sum(S1) ~ sum(S2) = diff .... (1)
    and we know that :
    sum(S1) + sum(S2) = sum(set) = range .... (2)
    from (1) and (2) :

    sum(S1) = (diff + range)/2

    Now we can simply count the number of subset with given sum(S1)

 */