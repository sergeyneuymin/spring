package org.sergeyneuymin.spring.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}

}
