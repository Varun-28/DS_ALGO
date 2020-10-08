//EASY
package numberSystem;

import java.util.Scanner;

public class Any_base_to_decimal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b){
        int sum = 0;
        int i = 0;
        while(n != 0){
            sum += (n%10) * Math.pow(b,i);
            n = n/10;
            i++;
        }
        return sum;
    }
}
