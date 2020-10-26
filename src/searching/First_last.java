//EASY
package searching;

//Question
//
//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//
//Assumption - Array is sorted. Array may have duplicate values.
//Sample Input
//
//        15
//        1
//        5
//        10
//        15
//        22
//        33
//        33
//        33
//        33
//        33
//        40
//        42
//        55
//        66
//        77
//        33
//
//        Sample Output
//
//        5
//        9

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class First_last {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int l = 0, r = n - 1, first = -1, last = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < d)
                l = mid + 1;
            else if (arr[mid] > d)
                r = mid - 1;
            else {
                last = mid;
                l = mid + 1;
            }
        }
        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] < d)
                l = mid + 1;
            else if (arr[mid] > d)
                r = mid - 1;
            else {
                first = mid;
                r = mid - 1;
            }
        }
        System.out.println(first);
        System.out.println(last);


    }
}
