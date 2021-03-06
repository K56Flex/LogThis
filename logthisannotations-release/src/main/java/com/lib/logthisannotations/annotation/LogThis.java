package com.lib.logthisannotations.annotation;

import com.lib.logthisannotations.internal.LoggerLevel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lpereira on 04/01/2016.
 */

/**
 * This annotation will log a method and its parameters whenever its called
 * Additionally it will log the returning value if the method does not have a generic return type of void
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
public @interface LogThis {
    LoggerLevel value() default LoggerLevel.D;
}
