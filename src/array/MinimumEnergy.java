package array;

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