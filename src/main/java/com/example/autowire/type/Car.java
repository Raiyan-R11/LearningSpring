package com.example.autowire.type;

public class Car {
    private Specification specification;

    // initialization done by setter instead of constructor
    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: "
                +specification.toString());
    }
}
