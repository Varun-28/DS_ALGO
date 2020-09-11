package array;

//Given a sorted array Arr of size N and a number X, you need to
//find the number of occurrences of X in Arr.
//Input:
//        N = 7, X = 2
//        Arr[] = {1, 1, 2, 2, 2, 2, 3}
//        Output: 4
//        Explanation: 2 occurs 4 times in the
//        given array.

//return 0 if X is not present.

//Your Task:
//    You don't need to read input or print anything. Your task is to
//    complete the function count() which takes the array of integers arr,
//    n and x as parameters and returns an integer denoting the answer.
//
//    Expected Time Complexity: O(logN)
//    Expected Auxiliary Space: O(1)
//
//    Constraints:
//    1 ≤ N ≤ 105
//    1 ≤ Arr[i] ≤ 106
//    1 ≤ X ≤ 106

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberOfOccurrence {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
//  Driver Code Ends
//User function Template for Java

class Solution {
    int count(int[] arr, int n, int x) {
        int i = leftOccurrence(arr, 0,n-1, x, n);
        if(i == -1) return 0;
        int j = rightOccurrence(arr, i,n-1, x, n);
        return (j-i+1);
    }
    int leftOccurrence(int[] arr, int low, int high, int x, int n){
        if(high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
            else if(x > arr[mid])
                return leftOccurrence(arr, (mid + 1), high, x, n);
            else
                return leftOccurrence(arr, low, (mid -1), x, n);
        }
        return -1;
    }
    int rightOccurrence(int[] arr, int low, int high, int x, int n){
        if(high >= low)
        {
            /*low + (high - low)/2;*/
            int mid = (low + high)/2;
            if( ( mid == n-1 || x < arr[mid+1]) && arr[mid] == x )
                return mid;
            else if(x < arr[mid])
                return rightOccurrence(arr, low, (mid -1), x, n);
            else
                return rightOccurrence(arr, (mid + 1), high, x, n);
        }
        return -1;
    }
}

