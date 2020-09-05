package array;

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
            System.out.println(Zero_count2(arr,n));
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
