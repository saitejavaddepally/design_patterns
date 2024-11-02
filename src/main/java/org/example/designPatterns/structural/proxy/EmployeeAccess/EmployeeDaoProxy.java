package org.example.designPatterns.structural.proxy.EmployeeAccess;

public class EmployeeDaoProxy implements EmployeeDAO{

    EmployeeDaoImp employeeDaoImp;

    EmployeeDaoProxy(){
        employeeDaoImp = new EmployeeDaoImp();
    }


    @Override
    public void create() {
        // keep the security check and call
        employeeDaoImp.create();
    }

    @Override
    public void modify() {
        // keep the security check and call
        employeeDaoImp.modify();
    }

    @Override
    public void get() {
        // keep the security check and call
        employeeDaoImp.get();
    }
}
