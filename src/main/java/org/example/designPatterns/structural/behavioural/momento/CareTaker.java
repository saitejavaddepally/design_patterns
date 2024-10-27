package org.example.designPatterns.structural.behavioural.momento;


import java.util.Stack;

public class CareTaker {

    private Stack<EmployeeMomento> employeeHistory = new Stack<>();

    public void save(Employee emp) {
        employeeHistory.push(emp.save());
    }


    public void revert(Employee employee){
        employee.revert(employeeHistory.pop());
    }
}
