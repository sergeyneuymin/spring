package org.sergeyneuymin.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.sergeyneuymin.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
