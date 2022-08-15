package part_number_two.£part.Lambda_expressions.Lambda_1;

import java.util.*;

public class New {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("GoodLuck");
        list.add("a");
        list.add("ab");
//        list.sort((t,e)->Integer.compare(t.length(),e.length()));
        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}
