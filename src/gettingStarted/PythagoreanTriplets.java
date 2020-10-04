//EASY
package gettingStarted;

import java.util.Scanner;

//1. You are required to check if a given set of numbers is a valid pythagorean triplet.
//2. Take as input three numbers a, b and c.
//3. Print true if they can form a pythagorean triplet and false otherwise
//
//Note - A Pythagorean triple consists of three positive integers a, b, and c, such that
//        a2 + b2 = c2. Such a triple is commonly written (a, b, c), and a well-known example is (3, 4, 5).

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = a;
        if(b >= max)
            max = b;

        if(c >= max)
            max = c;

        if(max == a){
            System.out.println((b * b + c * c) == (a * a));
        } else if(max == b){
            System.out.println((a * a + c * c) == (b * b));
        } else {
            System.out.println((a * a + b * b) == (c * c));
        }
    }
}
