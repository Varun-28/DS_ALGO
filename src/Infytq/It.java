package Infytq;

import java.util.*;

public class It {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list.size());
        list.add("Ravi1");
        System.out.println(list.size());
        list.add("Ravi2");
        list.add("Ravi3");
        list.remove(3);
        System.out.println(list.size());
        list.add("Ravi4");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
