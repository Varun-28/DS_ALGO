package array;

import java.util.Scanner;

public class KthSmallest {
    static int kthsmallest(int[] arr, int l, int r, int k)
    {
        if(l == r && l == k-1)
            return arr[l];
        else{
            int pivotIndex = partition(arr, l, r);
            if(pivotIndex == k - 1)
                return arr[pivotIndex];
            else if(pivotIndex < k-1)
                return kthsmallest(arr, pivotIndex + 1, r, k);
            else
                return kthsmallest(arr, l, pivotIndex, k);
        }
    }


    static int partition(int[] arr, int l, int r)
    {
        int pivot = arr[l];
        int i = l;
        int j = r;
        while(i < j){

            while(i < j && arr[--j] >= pivot);
            if(i < j){
                arr[i] = arr[j];
            }

            while(i < j && arr[++i] <= pivot);
            if(i < j){
                arr[j] = arr[i];
            }
        }
        arr[j] = pivot;
        return j;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int k = sc.nextInt();
            System.out.println(kthsmallest(arr, 0, n, k));
        }
    }
}
