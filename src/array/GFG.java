package array;

import java.math.BigInteger;
import java.util.Scanner;

public class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger obj = new BigInteger(String.valueOf(n));
            for (int i = 2; i <= n; i++) {
                if (!obj.isProbablePrime(i)) {
                    System.out.print(i + " ");
                }

            }
            System.out.println();

        }
    }
}

