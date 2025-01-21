package com.loose.ioc;

import com.loose.ioc.UserManager ;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {
    public static void main(String[] args) {

//        UserDataProvider databaseProvider = new UserDatabaseProvider();
//        UserManager userManagerWithDB = new UserManager(databaseProvider);
//        System.out.println(userManagerWithDB.getUserInfo());
//
//        UserDataProvider WebServiceProvider = new UserWebServiceProvider();
//        UserManager userManagerWithWebService = new UserManager(WebServiceProvider);
//        System.out.println(userManagerWithWebService.getUserInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIocLooseCouplingExample.xml");

        UserManager userWithWebServiceProvider = (UserManager) context.getBean("userWithWebServiceProvider");
        System.out.println(userWithWebServiceProvider.getUserInfo());

        UserManager userWithDatabaseProvider = (UserManager) context.getBean("userWithDatabaseProvider");
        System.out.println(userWithDatabaseProvider.getUserInfo());
    }
}
