package array;

//Given an array containing positive and negative numbers. The array
//represents checkpoints from one end to other end of street. Positive
//and negative values represent amount of energy at that checkpoint.
//Positive numbers increase the energy and negative numbers decrease.
//Find the minimum initial energy required to cross the street such that
//Energy level never becomes 0 or less than 0.
//
//Input:
// The first line of input contains a single integer T denoting the
// number of test cases. Then T test cases follow. Each test case
// consist of two lines. The first line of each test case consists
// of an integer N, where N is the size of array. The second line
// of each test case contains N space separated integers denoting
// array elements.
//
//        Constraints:
//        1 ≤ T ≤ 100
//        1 ≤ N ≤ 100
//        -500 ≤ A[i] ≤ 500
//
//        Example:
//
//        Input
//        2
//        5
//        4 -10 4 4 4
//        5
//        3  5 2  6 1
//
//        Output
//        7
//        1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinimumEnergy {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(MinEnergy(arr, n));
        }
    }
    //method 1
    public static int MinEnergy(int[] arr, int n) {
        int negative = 0, last_neg_index = 0, positive = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                negative += (-1) * arr[i];
                last_neg_index = i;
            }
        }
        if (negative == 0) return 1;
        for (int i = 0; i < last_neg_index; i++) {
            if (arr[i] > 0) {
                positive += arr[i];
            }
        }
        if (negative >= positive) {
            return (negative - positive + 1);
        } else {
            return 1;
        }
    }
    //method 2
    public static int MinEnergy2(int[] arr, int n){
        boolean check = true;
        int curr_energy = 0, min_energy = 0;
        for (int i = 0; i < n; i++){
            curr_energy += arr[i];

            if(curr_energy <= 0){
                min_energy += (-1)*curr_energy + 1;
                curr_energy = 1;
                check = false;
            }
        }
        return (check == true) ? 1 : min_energy;
    }
}