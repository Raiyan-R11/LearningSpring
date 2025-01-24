package com.example.componentscan.xmlmethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanExample.xml");

        //V if custom name used, ensure getBean matches
        //Employee employee = (Employee) context.getBean("senior_employee");
        Employee employee = (Employee) context.getBean("employee");

        //add context:component-scan to xml to not get no bean available errors
        System.out.println(employee.toString());
    }
}
