package gettingStarted;

//1. You've to display the digits of a number.
//2. Take as input "n", the number for which digits have to be displayed.
//3. Print the digits of the number line-wise.
//
//        Sample Input
//        65784383
//
//        Sample Output
//        6
//        5
//        7
//        8
//        4
//        3
//        8
//        3

import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = (int)Math.log10(n);
        len = (int)Math.pow(10,len);
        while(len != 0){
            System.out.println(n/len);
            n %= len;
            len /= 10;
        }
    }
}
