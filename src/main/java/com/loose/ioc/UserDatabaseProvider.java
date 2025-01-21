package com.loose.ioc;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        return "fetching data from database";
    }
}
