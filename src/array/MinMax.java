package array;

import java.util.Scanner;

public class MinMax {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] < min){
                    min = arr[i];
                }
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            System.out.println(min + " " + max);
        }

    }
}
