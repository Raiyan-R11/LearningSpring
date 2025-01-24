package com.example.componentscan.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        // ApplicationContext is an interface
        // ClassPathXmlApplicationContext is an implementation of ApplicationContext for .xml
        // AnnotationConfigApplicationContext is when only annotations are used
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       Employee employee = (Employee) context.getBean("employee");
       System.out.println(employee.toString());
    }
}
