package array;

//Given an array of size N consisting of only 0's and 1's. The array is
//sorted in such a manner that all the 1's are placed first and
//then they are followed by all the 0's. Find the count of all the 0's.
//
//        Example 1:
//
//        Input:
//        N = 12
//        Arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}
//        Output: 3
//        Explanation: There are 3 0's in the given array.


import java.util.Scanner;

//in this type of ques always use binary search
public class CountZero {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(Zero_count(arr,n));
        }
    }

    //O(n)
    public static int Zero_count(int[] arr, int n){
        if(arr[0] == 0) return n;
        if(arr[n-1] == 1) return 0;
        for (int i = 1; i < n; i++){
            arr[i] += arr[i-1];
        }
        return (n - arr[n-1]);


    }

    //O(logn)
    public static int Zero_count2(int[] arr, int n){
        int start = 0, end = n-1, mid = 0, pos = 0;
        while(start <= end){
            mid = (start + end)/2;
            if(arr[mid]==1){
                start = mid + 1;
            }else if(arr[mid] == 0){
                end = mid - 1;
                pos = mid;
            }
        }
        return (n-pos);
    }
}
