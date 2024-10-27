package org.example.designPatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {

        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

        employees.add(employeeFromDB);

        //Will not work! This is where the adapter comes into play!

        //Employee employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

        EmployeeLDAP employeeFromLdap = new EmployeeLDAP("chewie", "Solo", "Han", "han@solo.com");

        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        return employees;

    }
}
