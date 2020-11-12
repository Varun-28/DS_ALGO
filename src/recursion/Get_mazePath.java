package recursion;

//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two
//   moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
//3. Complete the body of getMazePath function - without changing signature - to get the list of
//   all paths that can be used to move from top-left to bottom-right.

//Sample Input
//
//        3
//        3
//
//Sample Output
//
//        [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Get_mazePath {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList < String > paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList < String > getMazePaths(int sr, int sc, int dr, int dc) {

        if (sr == dr && sc == dc) {
            ArrayList< String > bres = new ArrayList < > ();
            bres.add("");
            return bres;
        }

        ArrayList < String > hpaths = new ArrayList < > ();
        ArrayList < String > vpaths = new ArrayList < > ();

        if(sc < dc)
            hpaths = getMazePaths(sr, sc + 1, dr, dc);

        if(sr < dr)
            vpaths = getMazePaths(sr + 1, sc, dr, dc);

        ArrayList < String > paths = new ArrayList < > ();

        for (String hpath: hpaths) {
            paths.add('h' + hpath);
        }

        for (String vpath: vpaths) {
            paths.add('v' + vpath);
        }

        return paths;
    }
}
