package gettingStarted;

import java.util.Scanner;

public class Fast_pow {
    static int count = 0;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = pow(a,b);
        System.out.println(count);
    }
    public static int pow(int a, int b){
        count++;
        if(b == 0){
            return 1;
        }else if(b%2 != 0){
            return (a*pow(a,b-1));
        }else{
            return pow(a*a,b/2);
        }
    }
}
