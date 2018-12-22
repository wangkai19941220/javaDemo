/*
 * Copyright (c) 2018 maoyan.com
 * All rights reserved.
 *
 */
package com.imooc.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 在这里编写类的功能描述
 *
 * @author wangkai
 * @created 2018/12/15
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyLog {
    String requestUrl() default "";
}