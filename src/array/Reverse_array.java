//Easy
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Reverse_array {
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a){
        //code here
        //using two pointers algo
        int low = 0;
        int high = a.length-1;
        while(low < high){
            int temp = a[high];
            a[high] = a[low];
            a[low] = temp;
            low++;
            high--;
        }
    }

//method-2
//
//    public static void main (String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i = 0; i < n; i++){
//            arr[n-1-i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            System.out.println(arr[i]+" ");
//        }
//
// can also be done using stack

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a);
    }
}
