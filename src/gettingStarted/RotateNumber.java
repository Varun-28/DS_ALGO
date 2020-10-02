package gettingStarted;

//1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
//2. Take as input n and k.
//3. Print the rotated number.
//4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//        n = 12340056
//        k = 3
//        r = 05612340
//
//        Sample Input
//
//        562984
//        2
//
//        Sample Output
//
//        845629

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int len = (int)Math.log10(n)+1;
        k = k % len;
        if(k < 0)
            k += len;

        while(k != 0){
            int rem = n%10;
            n /= 10;
            n += rem*Math.pow(10,len-1);
            k--;
        }

        System.out.println(n);
    }
}
