package com.example.annotation.autowiredqualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("senior_employee") // custom name of bean
@Component // <--annotation eliminates the need for <bean> in xml file. by default registers bean with name of class
public class Employee {
    @Value("#{4*3}")
    private int employeeId;
    @Value("Raiyan")
    private String firstName;
    private String lastName;
    private double salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
