package numberSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Umbrella {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int req = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> sizes = new ArrayList<>();
        for(int i = 0; i < n; i++){
            sizes.add(sc.nextInt());
        }
        System.out.println(umbrella(req, sizes));
    }
    public static Integer umbrella(int req, List<Integer> sizes){

        if(sizes.contains(req)) return 1;

        int m = Integer.MAX_VALUE;
        for(Integer val : sizes){
            if(req%val == 0){
                m = Math.min(m,req/val);
            }
        }

        if(m != Integer.MAX_VALUE){
            return m;
        }else{
            int sum = sizes.get(0) + sizes.get(1);
            if (req % sum == 0) {
                m = req / sum;
                return m;
            } else {
                return -1;
            }
        }
    }
}
