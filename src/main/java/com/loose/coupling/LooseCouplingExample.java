package com.loose.coupling;

import com.loose.coupling.UserManager;

public class LooseCouplingExample {
    public static void main(String[] args) {
        //^ manages object creation.

        //implement an interface. Interface x = new Class
        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider WebServiceProvider = new UserWebServiceProvider();
        UserManager userManagerWithWebService = new UserManager(WebServiceProvider);
        System.out.println(userManagerWithWebService.getUserInfo());
    }
}
