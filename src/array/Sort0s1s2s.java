package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort0s1s2s{
    //method 1 O(2*n)
//    public static void sort012(int[] a, int n){
//        int[] countingArray = new int[3];
//        for(int i : a){
//            countingArray[a[i]]++;
//        }
//        int j = 0;
//        for(int i = 0; i <= 2; i++){
//            while(countingArray[i]>0){
//                a[j++] = i;
//                countingArray[i]--;
//            }
//        }
//    }

    //method 2 O(n) and O(1)
    //dutch national flag algorithm
    public static void sort012(int[] a, int n){
        int low = 0, mid = 0, high = n-1;
        int temp;
        while(mid <= high){
            switch(a[mid]){
                case 0:{
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    mid++;
                    low++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:{
                    temp = a[high];
                    a[high] = a[mid];
                    a[mid] = temp;
                    high--;
                    break;
                }
            }
        }
    }

// { Driver Code Starts.

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }

}

// } Driver Code Ends