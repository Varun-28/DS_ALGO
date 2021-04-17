package String;

public class IsDigit {
    public static void main(String[] args) {
        String s = "andnknq89328948nckns";
        int count = 0;
        for(char c : s.toCharArray()){
            if(c >= '0' && c <= '9'){
                count++;
            }
        }
        System.out.println(count);
    }
}
