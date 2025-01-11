package com.loose.coupling;

public class UserManager {
    // object of an interface
    private UserDataProvider userDataProvider;
    //private UserWebServiceProvider userDataProvider;
    //^creates instance of a class, not an interface. tight coupling!

    // can pass the UserDataProvider class as a param
    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }
}