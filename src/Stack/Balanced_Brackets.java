package Stack;
/*
1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e.
closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Balanced_Brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }else if(ch == ')'){
                boolean val = checkBracket(st, '(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if(ch == '}'){
                boolean val = checkBracket(st, '{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }else if(ch == ']'){
                boolean val = checkBracket(st, '[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }
        }

        if(st.size() == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    public static boolean checkBracket(ArrayDeque<Character> st, char corresch){
        if(st.size() == 0){
            return false;
        }else if(st.peek() != corresch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
