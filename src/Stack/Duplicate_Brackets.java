package Stack;
/*
1. You are given a string exp representing an expression.
2. Assume that the expression is balanced  i.e. the opening and closing
brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless.
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.'
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Duplicate_Brackets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayDeque<Character> st = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }else{
                    while (st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
