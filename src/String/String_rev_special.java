package String;
/*
reverse the alphabet sequence without changing the position of special symbol.

Input:
    a@bc#d&c*$

Output:
    c@dc#b&a*$
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_rev_special {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(!Character.isAlphabetic(c[l])){
                l++;
            }else if(!Character.isAlphabetic(c[r])){
                r--;
            }else{
                char t = c[l];
                c[l] = c[r];
                c[r] = t;
                r--;
                l++;
            }
        }
        s = String.valueOf(c);
        System.out.println(s);
    }
}
