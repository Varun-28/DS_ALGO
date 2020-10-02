package gettingStarted;

//1. You've to print all prime numbers between a range.
//2. Take as input "low", the lower limit of range.
//3. Take as input "high", the higher limit of range.
//4. For the range print all the primes numbers between low and high (both included).

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low; i <= high; i++){
            boolean b = isPrime(i);
            if(b == true)
                System.out.println(i);
        }
    }
    public static boolean isPrime(int n){
        if(n <= 1) return false;

        for(int i = 2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
