//EASY
package gettingStarted;

//1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the
//        circuit n times. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb
//        is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs
//        will be switched on after n fluctuations.
//2. Take as input a number n, representing the number of bulbs.
//3. Print all the bulbs that will be on after the nth fluctuation in voltage.

import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i * i <= n; i++){
            System.out.println(i * i);
        }
    }
}
// explanation :-
// only perfect-square numbers have odd numbers of factors so they remain onn.
// e.g. 4 -> 1x4, 2x2, 4x4
// e.g. 6 -> 1x6, 2x3, 3x2, 6x1
// so we will print all perfect-square numbers less than or equal to n.

// solution video link -> https://www.youtube.com/watch?v=7IbWTFOUP1U