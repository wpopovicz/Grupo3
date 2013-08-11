/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author Goiabinha
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.METHOD})
public @interface Metadata {
     String label();
     boolean required() default false;
     String invalidChars() default "";
     int size() default 0;
     String mask() default "";
     double maxValue() default Double.MAX_VALUE;
     double minValue() default Double.MIN_VALUE;
     String valadatorName() default "";
}
