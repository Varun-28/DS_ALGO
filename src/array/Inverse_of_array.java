//EASY
//see problem statement from InverseNumber ques from getting started package.
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inverse_of_array {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] a){
        // write your code here
        int[] result = new int[a.length];
        for(int i = 0; i < result.length; i++){
            result[a[i]] = i;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}
