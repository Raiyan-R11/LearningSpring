package com.example.annotation.autowiredqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Branch {
    @Autowired
    @Qualifier("manager")
    private Manager manager;

    @Override
    public String toString() {
        return "Branch{" +
                "manager=" + manager +
                '}';
    }
}
