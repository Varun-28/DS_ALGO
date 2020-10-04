//EASY
package gettingStarted;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if(n != 1)
            System.out.print(n);
    }
}

// solution video link -> https://www.youtube.com/watch?v=5gFC-ayyQMk