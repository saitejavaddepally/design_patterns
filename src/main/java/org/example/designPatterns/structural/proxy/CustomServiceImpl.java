package org.example.designPatterns.structural.proxy;

public class CustomServiceImpl implements CustomService{

    @Override
    public void doServiceCall() {
        System.out.println("Actual service doing the work");
    }

}
