//EASY
package String;

import java.util.Scanner;

public class String_pallindrome {
    public static void solution(String str){
        //write your code here
        for(int i = 0; i < str.length(); i++){
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                boolean b = isPallindrome(sub);
                if(b == true)
                    System.out.println(sub);
            }
        }
    }
    public static boolean isPallindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}
