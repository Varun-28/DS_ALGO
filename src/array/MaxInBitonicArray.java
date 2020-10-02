package array;

//Given an array Arr of N elements which is first increasing and then
//may be decreasing, find the maximum element in the array.
//Note: If the array is increasing then just print then last element
//will be the maximum value.
//
//        Example 1:
//
//        Input:
//        N = 9
//        Arr[] = {1,15,25,45,42,21,17,12,11}
//        Output: 45
//        Explanation: Maximum element is 45.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxInBitonicArray  {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution1().findMaximum(arr, n);
            System.out.println(ans);
        }
    }
}

class Solution1 {
    int findMaximum(int[] arr, int n) {
        int low = 0, high = n - 1;
        return findmax(arr,low,high);
    }
    int findmax(int[] arr, int low, int high){
        if (low == high)
            return arr[low];

        int mid = (low + high)/2;

        if ( arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1])
            return arr[mid];

        if (arr[mid] > arr[mid + 1] && arr[mid] < arr[mid - 1])
            return findmax(arr, low, mid-1);
        else
            return findmax(arr, mid + 1, high);
    }
}