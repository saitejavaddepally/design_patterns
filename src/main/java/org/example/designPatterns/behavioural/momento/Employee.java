package org.example.designPatterns.behavioural.momento;

public class Employee {

    private String name;
    private String address;
    private String phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public EmployeeMomento save() {
        return new EmployeeMomento(name, phone);
    }

    public void revert(EmployeeMomento emp) {
        this.name = emp.getName();
        this.phone = emp.getPhone();
    }

    @Override
    public String toString() {
        return "EmployeeDAO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
