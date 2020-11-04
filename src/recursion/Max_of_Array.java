package recursion;

import java.util.Scanner;

public class Max_of_Array {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println(maxOfArray(arr,0));
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1)
            return arr[idx];

        int misa = maxOfArray(arr,idx+1);
        //max element of small array = misa
        return Math.max(misa, arr[idx]);

    }
}
