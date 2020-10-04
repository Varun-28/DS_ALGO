//EASY
package gettingStarted;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int g = gcd(a,b);
        int l = (a*b)/g;

        System.out.println(g);
        System.out.println(l);
    }
    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
}
