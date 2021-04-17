package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SingleLineInput {
    public static void main(String[] args) throws IOException {
        // Using Scanner
        Scanner sc = new Scanner(System.in);

        /*
        Give input as :
        5
        1 2 3 4 5
         */
        int n = sc.nextInt();
        int[] arrn = new int[n];
        for(int i = 0; i < n; i++){
            arrn[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arrn[i] + " ");
        }
        // Using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        Give input as :
        6
        1 2 3 4 5 6
         */
        int m = Integer.parseInt(br.readLine());
        int[] arrm = new int[m];
        String s = br.readLine();

        for(int i = 0; i < m; i++){
            arrm[i] = Integer.parseInt(s.split(" ")[i]);
        }

        for(int i = 0; i < m; i++){
            System.out.print(arrm[i] + " ");
        }
    }
}
