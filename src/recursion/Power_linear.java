package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Power_linear {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(power(a,b));
    }

    public static int power(int x, int n){
        if(n == 0)
            return 1;
        else if(n == 1)
            return x;
        else
            return x*power(x,n-1);
    }
}
