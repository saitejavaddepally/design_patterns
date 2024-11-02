package org.example.designPatterns.structural.proxy.EmployeeAccess;

public class EmployeeDaoImp implements EmployeeDAO{
    @Override
    public void create() {
        System.out.println("created new row");
    }

    @Override
    public void modify() {
        System.out.println("modified the row");
    }

    @Override
    public void get() {
        System.out.println("getting the row");
    }
}
