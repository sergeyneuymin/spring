package org.sergeyneuymin.spring.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
