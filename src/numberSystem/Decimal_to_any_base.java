//EASY
package numberSystem;

import java.util.Scanner;

public class Decimal_to_any_base {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getValueInBase(n, b);
        System.out.println(dn);
    }

    public static int getValueInBase(int n, int b){
        int sum = 0;
        int i = 0;
        while(n != 0){
            sum += (n%b) * Math.pow(10,i);
            n = n/b;
            i++;
        }
        return sum;
    }
}
