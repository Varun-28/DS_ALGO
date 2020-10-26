//EASY
package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearSearch {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int d = Integer.parseInt(br.readLine());
        int index = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == d){
                index = i;
            }
        }

        System.out.println(index);
    }
}
