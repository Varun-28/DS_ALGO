package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Get_subsequence {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<String> result = gss(s);
        System.out.println(result);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> baselist = new ArrayList<>();
            baselist.add("");
            return baselist;
        }

        char c = str.charAt(0);
        String substr = str.substring(1);
        ArrayList<String> recursive_list = gss(substr);

        ArrayList<String> my_list = new ArrayList<>();
        for(String val: recursive_list){
            my_list.add(val);
        }
        for(String val: recursive_list){
            my_list.add(c + val);
        }

        return my_list;
    }
}
