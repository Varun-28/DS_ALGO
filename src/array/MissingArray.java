package array;

import java.util.Scanner;

public class MissingArray {
    //for finding only one missing no. in array
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            int i;
            while(t-->0){
                int n = sc.nextInt();
                int[] arr= new int[n-1];
                int total = ((n)*(n+1))/2;
                for(i=0;i<n-1;i++){
                    arr[i] = sc.nextInt();
                    total-=arr[i];
                }
                System.out.println(total);
            }
            //For finding more than one missing element in array
//		 public List<Integer> findDisappearedNumbers(int[] nums) {
//		       	TreeSet<Integer> temp = new TreeSet<Integer>();
//		        List<Integer> result = new ArrayList<>();
//				for(int i: nums){
//				    temp.add(i);
//				}
//
//		        for(int i=1;i<=nums.length;i++){
//		            if(!temp.contains(i)){
//		                result.add(i);
//		            }
//		        }
//		        return result;
//
//		    }
        }
}
