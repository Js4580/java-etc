package part_number_two.£part.Annotation.Own_creation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD /*, ElementType.TYPE*/)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "JN";
    int dateOfCreation() default 4580;
    String purpose();
}
