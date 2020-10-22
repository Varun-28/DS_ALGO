package array;

//Given an unsorted array arr[] of size N,
//rotate it by D elements (clockwise).
//     Input:
//       The first line of the input contains T denoting the number of
//       testcases. First line of each test case contains two space
//       separated elements, N denoting the size of the array and an
//       integer D denoting the number size of the rotation. Subsequent
//       line will be the N space separated array elements.

//        Constraints:
//        1 <= T <= 200
//        1 <= N <= 107
//        1 <= D <= N
//        0 <= arr[i] <= 105
//
//        Example:
//        Input:
//        2
//        5 2
//        1 2 3 4 5
//        10 3
//        2 4 6 8 10 12 14 16 18 20
//
//        Output:
//        3 4 5 1 2
//        8 10 12 14 16 18 20 2 4 6

import java.util.Scanner;

//method 1

public class ArrayRotate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (d > n) d %= n;

            for (int i = 0; i < d; i++) {
                rotate(arr, n);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void rotate(int[] arr, int n) {
        int first_element = arr[0];
        for (int j = 1; j < n; j++) {
            arr[j - 1] = arr[j];
        }
        arr[n - 1] = first_element;
    }
}

//	method 2

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		while(t-->0){
//		    int n = sc.nextInt();
//		    int d = sc.nextInt();
//		    int[] arr = new int[n];
//		    for(int i = 0; i < n; i++){
//		        arr[(n-d+i)%n] = sc.nextInt();
//		    }
//
//		    for(int i = 0; i < n; i++){
//		    	System.out.print(arr[i]+" ");
//		    }
//		    System.out.println();
//		}
//	}
//	For left rotate-
//	arr[i] = arr[(i+D)%N]
//
//	For right rotate-
//	arr[i] = arr[(i+N-D)%N]

//method 3 (best method)

//class ArrayRotate {
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int t = sc.nextInt();
//	while(t-->0){
//	    int n = sc.nextInt();
//	    int d = sc.nextInt();
//	    int[] arr = new int[n];
//	    for(int i = 0; i < n; i++){
//	        arr[i] = sc.nextInt();
//	    }
//      d %= n;
//      if(d < 0) d += n;
//        rotate(arr,0,d);
//        rotate(arr,d,n);
//        rotate(arr,0,n);
//	    for(int i = 0; i < n; i++){
//	    	System.out.print(arr[i]+" ");
//	    }
//	    System.out.println();
//	}
//}
//	public static void rotate(int[] arr, int start, int end){
//	    int i = start;
//	    int j = end-1;
//	    while(i<j){
//	        int temp = arr[i];
//	        arr[i] = arr[j];
//	        arr[j] = temp;
//	        i++;
//	        j--;
//	    }
//	}
//}

