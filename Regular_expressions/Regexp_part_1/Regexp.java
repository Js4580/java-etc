package part_number_two.£part.Regular_expressions.Regexp_part_1;

public class Regexp {
    public static void main(String[] args) {
        /*
         * \\d - одна цифра
         * ниже два после \\d
         * + - один или более
         * * - нуль или более
         * ? - 0 или 1 до
         * (...|...|...|) - одна строка из множества
         * ([...]) - возможные символы до \\d
         * [^abc] - мы хотим все символы кроме [abc]
         *
         * . - любой символ
         *
         * {2} - строго 2 и не больше и не меньше  (\\d{2})
         * {2,} - от 2 до infinity (\\d{2,})
         * {2, 4} - от 2 до 4 (\\d{2, 4})
         * */

        /*
         * \\w - одна английская буква и 0-9
         * \\w - [a-zA-Z_0-9]
         * */
        String string_1 = "-11212121";
        String string_2 = "*11212121";
        String string_3 = "?11212121";
        String string_4 = "a11212121";
        boolean bool_1 = string_4.matches("(.)?\\d*");
        System.out.println(bool_1);
//        описание всех букв
        String string_5 = "a2461821369";
        boolean bool_2 = string_5.matches("[a-zA-Z]\\d+");
        System.out.println(bool_2);
//        так же так
        String string_6 = "aasdfghgfew2461821369";
        boolean bool_3 = string_5.matches("[a-zA-Z]+\\d+");
        System.out.println(bool_3);
//        так же так
        String string_7 = "aasdf12432аыфафыаыф5677ghgfew2461821369";
        boolean bool_4 = string_5.matches("[a-zA-Z1-9а-я]+\\d+");
        System.out.println(bool_4);

//        new
        String string_8 = "-+#@412412hi";
        boolean bool_5 = string_8.matches("[^abc]*");
        System.out.println("вот - " + bool_5);

//        .
        String url_1 = "http://www.google.com";
        String url_2 = "http://www.yandex.ru";
        String url_3 = "Hello world";
        System.out.println(url_1.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url_2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url_3.matches("http://www\\..+\\.(com|ru)"));
//        {}
        String string_9 = "123";
        System.out.println(string_9.matches("\\d{3}"));
//        \\w
        String string_10 = "123 ";
        System.out.println(string_10.matches("\\w{3}"));
    }
}
