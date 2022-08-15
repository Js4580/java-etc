package part_number_two.£part.Lambda_expressions.Lambda_2;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        int[] array = new int[10];
        List<Integer> list = new ArrayList<>();
        fiilArray(array);
        fillList(list);

        System.out.println(list);
        System.out.println(Arrays.toString(array));

//        без lambda exp
        for (int i = 0; i < 10; i++) {
            array[i] = array[i] * 2;
            list.set(i, list.get(i) * 2);
        }

        System.out.println(list);
        System.out.println(Arrays.toString(array));
//        а теперь с lambda exp
        array = Arrays.stream(array).map(hiJasmin -> hiJasmin * 2).toArray();
        list = list.stream().map(hiJasmin -> hiJasmin * 2).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(Arrays.toString(array));
    }

    private static void fillList(List<Integer> list) {
        for (int index = 0; index < 10; index++) list.add(index + 1);
    }

    private static void fiilArray(int[] array) {
        for (int i = 0; i < 10; i++) array[i] = i + 1;
    }
}
