package recursion;

//1. You are given a positive number n.
//2. You are required to print the counting from n to 1.
//3. You are required to not use any loops. Complete the body
//   of print Decreasing function to achieve it.
//Sample Input
//
//        5
//
//Sample Output
//
//        5
//        4
//        3
//        2
//        1

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print_decreasing {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printDecreasing(n);
    }

    public static void printDecreasing(int n) {
        if(n == 0){
            return;
        }

        System.out.println(n);
        printDecreasing(n - 1);
    }
}

//must watch video :- https://www.youtube.com/watch?v=5Q5ed7PWJ8I&t=16s