package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array_display_reverse {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        displayArr(arr,n-1);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == -1)
            return;

        System.out.println(arr[idx]);
        displayArr(arr, idx-1);
    }
}
