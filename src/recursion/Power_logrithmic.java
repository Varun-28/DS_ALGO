package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Power_logrithmic {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(power(a, b));
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;
        else if (n%2 == 0)
            return power(x*x, n/2);
        else
            return x * power(x*x, n/2);
    }
}

//must watch video :- https://www.youtube.com/watch?v=O84uumjBOMY