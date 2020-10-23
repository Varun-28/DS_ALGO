//EASY
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

//solution 1
public class Sum_of_two_array {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++)
            arr1[i] = Integer.parseInt(br.readLine());

        int n2 = Integer.parseInt(br.readLine());
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++)
            arr2[i] = Integer.parseInt(br.readLine());

        ArrayList<Integer> result = new ArrayList();

        int carry = 0;
        int d = 0;
        n1--;
        n2--;
        while (n1 >= 0 || n2 >= 0 || carry > 0) {

            if (n1 >= 0 && n2 >= 0) {
                d = arr1[n1--] + arr2[n2--] + carry;
            } else if (n1 < 0 && n2 >= 0) {
                d = arr2[n2--] + carry;
            } else if (n1 >= 0 && n2 < 0) {
                d = arr1[n1--] + carry;
            } else {
                d = carry;
            }
            carry = d / 10;
            d %= 10;

            result.add(d);
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.println(result.get(i));
        }
    }

//solution 2

//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n1 = Integer.parseInt(br.readLine());
//        int[] a1 = new int[n1];
//        for(int i = 0; i < n1; i++){
//            a1[i] = Integer.parseInt(br.readLine());
//        }
//
//        int n2 = Integer.parseInt(br.readLine());
//        int[] a2 = new int[n2];
//        for(int i = 0; i < n2; i++){
//            a2[i] = Integer.parseInt(br.readLine());
//        }
//
//        int[] sum = new int[n1 > n2? n1: n2];
//        int i = n1 - 1;
//        int j = n2 - 1;
//        int k = sum.length - 1;
//        int c = 0;
//        while(i >= 0 || j >= 0){
//            int d = c;
//
//            if(i >= 0)
//                d += a1[i];
//
//            if(j >= 0)
//                d += a2[j];
//
//            c = d / 10;
//            d = d % 10;
//            sum[k] = d;
//
//            i--;
//            j--;
//            k--;
//        }
//
//        if(c > 0){
//            System.out.println(c);
//        }
//        for(int val: sum){
//            System.out.println(val);
//        }
//    }
}
