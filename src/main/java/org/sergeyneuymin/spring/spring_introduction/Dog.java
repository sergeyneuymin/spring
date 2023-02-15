package org.sergeyneuymin.spring.spring_introduction;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
@Scope("prototype")
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("Wow");
    }

    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
