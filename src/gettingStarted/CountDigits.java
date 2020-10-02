package gettingStarted;

//1. You've to count the number of digits in a number.
//2. Take as input "n", the number for which the digits has to be counted.
//3. Print the digits in that number.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = (int)Math.log10(n) + 1;
        System.out.println(n);
    }
}
