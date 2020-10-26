//EASY
package searching;

//1. You are given a number n, representing the size of array a.
//2. You are given n numbers, representing elements of array a.
//3. You are given another number d.
//4. You are required find the ceil and floor of d in the array a.
//
//Ceil is defined as value in array which is just greater than d. If an
//element equal to d exists that will be considered as ceil.
//Floor is defined as value in array which is just lesser than d. If an
//element equal to d exists that will be considered as floor.
//Asssumption - Array is sorted.
//Sample Input
//
//        10
//        1
//        5
//        10
//        15
//        22
//        33
//        40
//        42
//        55
//        66
//        34
//
//        Sample Output
//
//        40
//        33

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ciel_floor {
    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int l = 0, h = n-1, ciel = -1, floor = -1;

        while(l <= h){
            int mid = (l + h)/2;
            if(arr[mid] < d){
                floor = arr[mid];
                l = mid + 1;
            }else if(arr[mid] > d){
                ciel = arr[mid];
                h = mid - 1;
            }else{
                if(mid >0)
                    floor = arr[mid-1];
                if(mid <n-1)
                    ciel = arr[mid+1];
                break;
            }
        }
        System.out.println(ciel);
        System.out.println(floor);
    }
}
