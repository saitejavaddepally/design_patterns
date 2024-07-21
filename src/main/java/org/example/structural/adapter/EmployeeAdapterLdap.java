package org.example.structural.adapter;

public class EmployeeAdapterLdap implements Employee {

    private final EmployeeLDAP employeeLDAP;

    public EmployeeAdapterLdap(EmployeeLDAP employeeFromLdap) {

        this.employeeLDAP = employeeFromLdap;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCn();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getGivenName();
    }

    @Override
    public String getLastName() {
        return employeeLDAP.getSurname();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getMail();
    }
}
