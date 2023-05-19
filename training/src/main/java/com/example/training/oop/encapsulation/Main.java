package com.example.training.oop.encapsulation;

// Encapsulation is the technique of making the fields in a class private and providing 
// access to them via public methods (getters and setters). It is a protective barrier 
// that prevents the data and code being randomly accessed by other code defined outside the class. 
// This also allows for the internal representation of an object to be hidden from the outside.

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("John");
        System.out.println(employee.getName());
    }
    
}
