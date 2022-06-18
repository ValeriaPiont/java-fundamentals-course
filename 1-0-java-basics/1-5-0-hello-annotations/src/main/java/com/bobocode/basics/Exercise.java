package com.bobocode.basics;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = ElementType.TYPE) // class, interface or enumeration
public @interface Exercise {

    String value() default "Unknown name";

    Level complexityLevel() default Level.BASIC;

}
