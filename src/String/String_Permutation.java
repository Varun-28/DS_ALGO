package String;

//Sample Input
//
//        abc
//
//Sample Output
//
//        abc
//        bac
//        cab
//        acb
//        bca
//        cba

import java.util.Scanner;

public class String_Permutation {
    public static void solution(String str){
        // write your code here
        int limit = factorial(str.length());

        for(int i = 0; i < limit; i++){
            int temp = i;
            StringBuilder sb = new StringBuilder(str);
            String s = "";
            for(int j = sb.length(); j >= 1 ; j--){
                int rem = temp%j;
                temp /= j;
                s += sb.charAt(rem);
                sb.deleteCharAt(rem);
            }
            System.out.println(s);
        }
    }
    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
