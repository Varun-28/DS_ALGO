package recursion;

//Sample Input
//
//        abc
//
//Sample Output
//
//        abc
//        acb
//        bac
//        bca
//        cab
//        cba

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Permutations {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        printPermutations(s, "");
    }

    public static void printPermutations(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String sub = str.substring(0,i) + str.substring(i+1);
            printPermutations(sub, ans + ch);
        }
    }
}
