package array;

import java.util.Scanner;

public class ReverseArray {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[n-1-i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]+" ");
        }
    }
    //can also be done using stack and 2-pointers algorithm
}
