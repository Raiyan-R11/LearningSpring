package com.example.annotation.autowiredqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    // Field injection (not recommended)
    @Autowired
    @Qualifier("employee")
    private Employee employee;

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }

    // Constructor injection
//    @Autowired // Spring will check the dependency (Employee) and inject it
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
}
