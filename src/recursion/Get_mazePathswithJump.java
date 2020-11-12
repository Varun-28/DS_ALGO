package recursion;

//1. You are given a number n and a number m representing number of rows and columns in a maze.
//2. You are standing in the top-left corner and have to reach the bottom-right corner.
//3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ),
//   or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
//4. Complete the body of getMazePath function

//Sample Input
//
//        2
//        2
//
//Sample Output
//
//        [h1v1, v1h1, d1]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Get_mazePathswithJump {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();
        for(int move = 1; move <= dc - sc; move++){
            ArrayList<String> hpaths = getMazePaths(sr, sc + move, dr, dc);
            for(String hpath: hpaths){
                paths.add("h" + move + hpath);
            }
        }

        for(int move = 1; move <= dr - sr; move++){
            ArrayList<String> vpaths = getMazePaths(sr + move, sc, dr, dc);
            for(String vpath: vpaths){
                paths.add("v" + move + vpath);
            }
        }

        for(int move = 1; move <= dc - sc && move <= dr - sr; move++){
            ArrayList<String> dpaths = getMazePaths(sr + move, sc + move, dr, dc);
            for(String dpath: dpaths){
                paths.add("d" + move + dpath);
            }
        }

        return paths;
    }

}
