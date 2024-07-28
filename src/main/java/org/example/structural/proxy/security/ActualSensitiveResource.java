package org.example.structural.proxy.security;

public class ActualSensitiveResource implements SensitiveResource{
    @Override
    public void accessResource() {
        System.out.println("accessing sensitive data");
    }
}
