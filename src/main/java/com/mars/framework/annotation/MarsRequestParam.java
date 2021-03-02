package com.mars.framework.annotation;

import java.lang.annotation.*;

/**
 * @author mars
 * @since 2019/11/6 12:38
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarsRequestParam {
    String value() default "";
}
