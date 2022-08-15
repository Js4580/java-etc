package part_number_two.£part.Lambda_expressions.Lambda_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class New {
    public static void main(String[] args) {
        int[] array_1 = new int[10];
        List<Integer> list_1 = new ArrayList<>();
        fiilArray(array_1);
        fillList(list_1);

//        map method
        array_1 = Arrays.stream(array_1).map(hiJasmin -> hiJasmin * 2).toArray();
        list_1 = list_1.stream().map(hiJasmin -> hiJasmin * 2).collect(Collectors.toList());

        array_1 = Arrays.stream(array_1).map(a -> 3).toArray();
        array_1 = Arrays.stream(array_1).map(a -> a + 1).toArray();
        list_1 = list_1.stream().map(a -> 3).collect(Collectors.toList());

        System.out.println(list_1);
        System.out.println(Arrays.toString(array_1));

//        filter method
        int[] array_2 = new int[10];
        List<Integer> list_2 = new ArrayList<>();

        fiilArray(array_2);
        fillList(list_2);

        array_2 = Arrays.stream(array_2).filter(kill -> kill % 2 == 0).toArray();
        list_2 = list_2.stream().filter(iLoveYou -> iLoveYou % 2 == 0).collect(Collectors.toList());

        System.out.println(list_2);
        System.out.println(Arrays.toString(array_2));

//        forEach method
        /*Arrays.stream(array_2).forEach(a -> System.out.println(a));
//        or
        Arrays.stream(array_2).forEach(System.out::println);*/

//        reduce method
        int[] array_3 = new int[10];
        List<Integer> list_3 = new ArrayList<>();

        fiilArray(array_3);
        fillList(list_3);

        int sum = Arrays.stream(array_3).reduce((acc, b) -> acc / b).getAsInt();
        int product = list_3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum);
        System.out.println(product);

//        method chaining
        int[] array_4 = new int[10];

        fiilArray(array_4);

        array_4 = Arrays.stream(array_4).filter(zxc -> zxc % 2 != 0).map(JN -> JN * 2).toArray();
        System.out.println(Arrays.toString(array_4));
    }

    private static void fillList(List<Integer> list_1) {
        for (int index = 0; index < 10; index++) list_1.add(index + 1);
    }

    private static void fiilArray(int[] array_1) {
        for (int i = 0; i < 10; i++) array_1[i] = i + 1;
    }
}
