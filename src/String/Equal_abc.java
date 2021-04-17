package String;
/*
Given a String of lowercase alphabet. Find out the number of substring of given
String in which count of character a,b,c is same
 */
import java.util.Scanner;

public class Equal_abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;

        for(int i = 0; i < s.length(); i++)
        {
            for (int j = i + 1; j <= s.length(); j++) {
                if(count(s.substring(i, j))){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    public static boolean count(String s){
        int a = 0, b = 0, c = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'a'){
                a++;
            }else if(ch == 'b'){
                b++;
            }else if(ch == 'c'){
                c++;
            }
        }
        return (a == b && b == c);
    }
}
