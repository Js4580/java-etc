package part_number_two.£part.Reflection.Reflection_part_2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);

        Class<?> objectClass_1 = Class.forName(scanner.next());
        Class<?> objectClass_2 = Class.forName(scanner.next());
        String methodName = scanner.next();

        Method method = objectClass_1.getMethod(methodName, objectClass_2);

        Object object_1 = objectClass_1.getDeclaredConstructor().newInstance();
        Object object_2 = objectClass_2.getConstructor(String.class).newInstance(scanner.next());

        method.invoke(object_1,object_2);
        System.out.println(method);

        System.out.println(object_1);


    }
}
