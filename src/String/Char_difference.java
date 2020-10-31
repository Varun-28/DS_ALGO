package String;

//1. You are given a string that contains only lowercase and uppercase alphabets.
//2. You have to form a string that contains the difference of ASCII values
//of every two consecutive characters between those characters.
//        For "abecd", the answer should be "a1b3e-2c1d", as
//        'b'-'a' = 1
//        'e'-'b' = 3
//        'c'-'e' = -2
//        'd'-'c' = 1

import java.util.Scanner;

public class Char_difference {
    public static String solution(String str){
        StringBuilder sb = new StringBuilder(str);
        StringBuilder result = new StringBuilder();
        result.append(sb.charAt(0));

        for(int i = 1; i < sb.length(); i++){
            result.append((sb.charAt(i)-sb.charAt(i-1)));
            result.append(sb.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}
