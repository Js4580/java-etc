package part_number_two.£part.Regular_expressions.Regexp_part_2;

import java.util.Arrays;

public class Regexp {
    public static void main(String[] args) {
//        split
        String string_1 ="Hello$there$hey";
        String[] words_1 = string_1.split("\\$");
        System.out.println(Arrays.toString(words_1));
        String string_2 ="Hello421421421412there4124124124124hey4124124214";
        String[] words_2 = string_2.split("\\d+");
        System.out.println(Arrays.toString(words_2));
        String string_3 ="HelloJasminthereJasminheyJasmin";
        String[] words_3 = string_3.split("(Jasmin)");
        System.out.println(Arrays.toString(words_3));
//        replace
        String str_1 = "Hello there hey";
        String modifiedString_1 = str_1.replaceAll(" ",".");
        System.out.println(modifiedString_1);
        String str_2 = "Hello4124124124124124there4124124124214hey41241242149851259210412";
        String modifiedString_2 = str_2.replaceAll("\\d+","4580");
        System.out.println(modifiedString_2);
    }
}
