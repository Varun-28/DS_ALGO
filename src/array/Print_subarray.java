package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print_subarray {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int len = a.length;
        for(int i = 0;  i < len; i++){
            for(int j = i; j < len; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(a[k]+"\t");
                }
                System.out.println();
            }
        }
    }
}
