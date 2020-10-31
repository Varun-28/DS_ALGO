package String;

//Sample Input
//
//        pepCODinG
//
//Sample Output
//
//        PEPcodINg

import java.util.Scanner;

public class Toggle_case {
    public static String toggleCase(String str){
        //write your code here
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i < sb.length(); i++){
            char c = sb.charAt(i);

            if(c>='a' && c<='z'){
                c = (char)('A' + c - 'a');
                sb.setCharAt(i,c);
            }else if(c>='A' && c<='Z'){
                c = (char)('a' + c - 'A');
                sb.setCharAt(i,c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
