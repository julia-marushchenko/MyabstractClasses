/**
 *  Java program to create abstract classes.
 */

package com.myclasses;

import java.util.Date;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating objects of Employee type.
        Employee employee = new RegularEmployee("Jack", "Finance", 10000);
        Employee employee1 = new ContractualEmployee("Stive", "Security", 15000);

        // Printing salaries of employee and employee1.
        System.out.println("Jack's salary: " + employee.getSalary());
        System.out.println("Stive's salary: " + employee1.getSalary());

    }
}

/**
 *  Employee class.
 */
abstract class Employee {

    // Fields of the class.
    String name;
    Date date;
    String department;
    double salary;

    // Constructor of the class.
    public Employee(String name,  String department) {
        this.name = name;
        this.department = department;
    }

    // Method to get name of an employee.
    public String getName() {
        return name;
    }

    // Method to get a date of joining an employee.
    public Date getDate() {
        return date;
    }

    // Abstract method to return salary.
    abstract double getSalary();
}

/**
 * ContractualEmployee class.
 */
class ContractualEmployee extends Employee {

    // Constructor of class.
    public ContractualEmployee(String name, String department, double salary) {
        super(name, department);
        this.salary = salary;
    }

    // Method to return salary.
    @Override
    double getSalary() {
        return this.salary;
    }
}

class RegularEmployee extends Employee {

    // Constructor of the class.
    public RegularEmployee(String name, String department, double salary) {
        super(name, department);
        this.salary = salary;
    }

    // Method to return salary.
    @Override
    double getSalary() {
        return this.salary;
    }
}