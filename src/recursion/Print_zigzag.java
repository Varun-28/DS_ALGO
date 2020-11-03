package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Print_zigzag {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        pzz(a);
    }

    public static void pzz(int n){
        if(n == 0){
            return;
        }

        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");

    }
}

//must watch video :- https://www.youtube.com/watch?v=R7qja_gZrvI&feature=emb_logo