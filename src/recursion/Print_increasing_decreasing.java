package recursion;

//Sample Input
//
//        3
//
//Sample Output
//
//        3
//        2
//        1
//        1
//        2
//        3

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print_increasing_decreasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        pdi(n);
    }

    public static void pdi(int n){
        if(n == 0)
            return;

        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}
