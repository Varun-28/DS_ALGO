package recursion;

//1. You are given a number n representing number of stairs in a staircase.
//2. You are standing at the bottom of staircase. You are allowed to
//   climb 1 step, 2 steps or 3 steps in one move.
//3. Complete the body of getStairPaths function - without changing
//   signature - to get the list of all paths that can be used to climb the staircase up.

//Sample Input
//
//        3
//
//Sample Output
//
//        [111, 12, 21, 3]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Get_stairPaths {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> baselist = new ArrayList<>();
            baselist.add("");
            return baselist;
        }else if(n < 0){
            ArrayList<String> baselist = new ArrayList<>();
            return baselist;
        }

        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> res = new ArrayList<>();

        for(String path: path1){
            res.add(1 + path);
        }
        for(String path: path2){
            res.add(2 + path);
        }
        for(String path: path3){
            res.add(3 + path);
        }
        return res;
    }
}
