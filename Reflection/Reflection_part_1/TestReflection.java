package part_number_two.£part.Reflection.Reflection_part_1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class<Person> personClass_1 = Person.class;
        Class<? extends  Person> personClass_2 = person.getClass();
        Class<?> personClass_3 = Class.forName("part_number_two.£part.Reflection.Reflection_part_1.TestReflection");

//        Method[] methods = personClass_1.getMethods();
//        for (Method method:
//             methods) {
//            System.out.println(method.getName() + ", " + method.getReturnType() + ", " + Arrays.toString(method.getParameterTypes()));
//        }

//        Field[] fields = personClass_1.getDeclaredFields();
//        for (Field fiend:
//                fields) {
//            System.out.println(fiend.getName() + ", " + fiend.getType());
//        }

        Annotation[] annotations = personClass_1.getAnnotations();
        for (Annotation annotation:
                annotations) {
            if (annotation instanceof Author)
                System.out.println("yes, so good. it triples me baby completely");
        }
    }
}
