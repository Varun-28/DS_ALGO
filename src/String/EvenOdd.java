package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int sp_ch = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                if(ch%2 == 0){
                    even.add((ch - '0'));
                }else{
                    odd.add((ch - '0'));
                }
            }
            if(!Character.isDigit(ch) && !Character.isLetter(ch)){
                sp_ch++;
            }

        }

        int maxSize = Math.max(even.size(),odd.size());

        if(sp_ch%2 == 0){
            for(int i = 0; i < maxSize; i++){
                if(i < even.size()){
                    System.out.print(even.get(i));
                }
                if(i < odd.size()){
                    System.out.print(odd.get(i));
                }
            }
        }else{
            for(int i = 0; i < maxSize; i++){
                if(i < odd.size()){
                    System.out.print(odd.get(i));
                }
                if(i < even.size()){
                    System.out.print(even.get(i));
                }
            }
        }

    }
}
