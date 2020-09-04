package array;

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

//method 3

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

