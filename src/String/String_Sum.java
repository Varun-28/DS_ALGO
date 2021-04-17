package String;

import java.util.Scanner;

public class String_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(",");
        Method2(arr);
        int l = 0;
        int r = arr.length - 1;
        int num1 = 0;
        while((l < r) && (!arr[l].equals("4") || !arr[r].equals("7"))){
            if(!arr[l].equals("4")){
                num1 += Integer.parseInt(arr[l]);
                l++;
            }
            if(!arr[r].equals("7")){
                num1 += Integer.parseInt(arr[r]);
                r--;
            }
        }
        String s = "";
        for(int i = l; i <= r; i++){
            s += arr[i];
        }
        System.out.println(Integer.parseInt(s) + num1 );
    }
    public static void Method2(String[] arr){
        int idx4 = 0, idx7 = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            if(arr[i].equals("4")){
                idx4 = i;
            }
            if(arr[i].equals("7")){
                idx7 = i;
            }
        }
        int num1 = Integer.parseInt(sb.substring(idx4, idx7+1));
        String s = sb.substring(0,idx4) + sb.substring(idx7+1);
        int num2 = 0;
        for(char c : s.toCharArray()){
            num2 += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(num1 + num2);
    }
}
