//EASY
package array;

//Sample Input
//
//        3
//        10
//        20
//        30
//
//        Sample Output
//
//        -   -	  -
//        -	  -	  30
//        -	  20  -
//        -	  20  30
//        10  -	  -
//        10  -	  30
//        10  20  -
//        10  20  30

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Subset_of_array {
    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int limit = (int)Math.pow(2,n);

        for(int i = 0; i < limit; i++){
            //convert i to binary and if there are 1's print element
            //at that position else print -
            int temp = i;
            String s = "";

            for(int k = n-1; k >= 0; k--){
                int r = temp%2;
                temp /= 2;

                if(r == 0)
                    s = "-" + "\t" + s;
                else
                    s = arr[k] + "\t" + s;
            }
            System.out.println(s);
        }

    }
}
//concept
//for n = 3,
//        limit = 2^3 = 8
//        So, 0 to 7
// 0 =  0 0 0
// 1 =  0 0 1
// 2 =  0 1 0
// 3 =  0 1 1
// 4 =  1 0 0
// 5 =  1 0 1
// 6 =  1 1 0
// 7 =  1 1 1
// in place of 0 print - and in place of 1 print element at that position
