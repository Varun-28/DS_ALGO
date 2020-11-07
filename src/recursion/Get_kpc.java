package recursion;

//1. You are given a string str. The string str will contains numbers only,
//    where each number stands for a key pressed on a mobile phone.
//2. The following list is the key to characters map :
//        0 -> .;
//        1 -> abc
//        2 -> def
//        3 -> ghi
//        4 -> jkl
//        5 -> mno
//        6 -> pqrs
//        7 -> tu
//        8 -> vwx
//        9 -> yz
//3. Complete the body of getKPC function - without changing signature - to
//    get the list of all words that could be produced by the keys in str.
//    Use sample input and output to take idea about output.

//Sample Input
//
//        78
//
//Sample Output
//
//        [tv, tw, tx, uv, uw, ux]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Get_kpc {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        for(char chcode: codes[ch - '0'].toCharArray()){
            for(String rstr: rres){
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }
}
