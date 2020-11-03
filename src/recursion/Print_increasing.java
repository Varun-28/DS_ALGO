package recursion;

//Sample Input
//
//        5
//
//Sample Output
//
//        1
//        2
//        3
//        4
//        5

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print_increasing {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n == 0)
            return;

        printIncreasing(n-1);
        System.out.println(n);
    }
}
