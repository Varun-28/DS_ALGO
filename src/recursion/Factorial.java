package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
        if(n == 0)
            return 1;
        else
            return (n*factorial(n-1));
    }
}
