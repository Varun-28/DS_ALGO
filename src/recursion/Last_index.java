package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Last_index {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int fi = firstIndex(arr, n-1, x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if(idx < 0){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        } else {
            int fiisa = firstIndex(arr, idx - 1, x);
            return fiisa;
        }
    }
}
