package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Make_String_Pallindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String s = br.readLine();
            //System.out.println(MakePallindrome(s.toCharArray(),0,s.length()-1));
            System.out.println(MakePallindrome(s.toCharArray(), s.length()));
        }
    }
    public static int MakePallindrome(char[] s, int l, int h){
        if(l > h) return Integer.MAX_VALUE;
        if(l == h) return 0;
        if(l == h - 1) return ((s[l] == s[h]) ? 0 : 1);

        return (s[l] == s[h]) ?
                MakePallindrome(s, l + 1, h - 1) :
                (Integer.min(MakePallindrome(s, l, h - 1),MakePallindrome(s, l + 1, h))+1);
    }
    public static int MakePallindrome(char[] s, int n)
    {
        int[][] table = new int[n][n];
        int l, h, x;

        for (x = 1; x < n; x++)
            for (l = 0, h = x; h < n; l++, h++)
                table[l][h] = (s[l] == s[h])?
                        table[l+1][h-1] :
                        (Integer.min(table[l][h-1],
                                table[l+1][h]) + 1);

        return table[0][n-1];
    }
}
