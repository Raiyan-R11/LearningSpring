package com.example.annotation.autowiredqualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        // ApplicationContext is an interface
        // ClassPathXmlApplicationContext is an implementation of ApplicationContext for .xml
        // AnnotationConfigApplicationContext is when only annotations are used
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       Employee employee = (Employee) context.getBean("employee");
       System.out.println(employee.toString());

       // Dependency injected into Manager with Autowired annotation
       Manager manager = (Manager) context.getBean("manager");
       System.out.println(manager.toString());

        Branch branch = (Branch) context.getBean("branch");
        System.out.println(branch.toString());
    }
}
