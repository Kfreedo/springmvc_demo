package com.mars.framework.annotation;

import java.lang.annotation.*;

/**
 * @author mars
 * @since 2019/11/6 12:38
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarsController {
    String value() default "";
}
