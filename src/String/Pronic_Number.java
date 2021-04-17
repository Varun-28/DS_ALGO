package String;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Pronic_Number {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 1; i < 1000; i++){
            arr.add(i*(i+1));
        }
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            for(int j = i + 1; j <= input.length(); j++){
                if(arr.contains(Integer.parseInt(input.substring(i,j)))){
                    set.add(Integer.parseInt(input.substring(i,j)));
                }
            }
        }
        String res = "";
        for(Integer i : set){
            res += i + ",";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}
