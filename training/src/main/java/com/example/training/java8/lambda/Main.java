package com.example.training.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("John Doe", 50000),
            new Employee("Jane Doe", 60000),
            new Employee("Bob", 70000),
            new Employee("Alice", 80000)
        );

        List<Employee> result = employees.stream()
            .filter(e -> e.getSalary() > 60000)    // filter employees with salary > 60000
            .sorted(Comparator.comparing(Employee::getName))  // sort the filtered employees by name
            .collect(Collectors.toList());   // collect the result into a new list

        result.forEach(System.out::println);
    }
}
