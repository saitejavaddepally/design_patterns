package org.example.structural.proxy.security;

public class ProxySecurity {

    public static void main(String[] args) {

        SensitiveResource authorizedProxy = new SecurityProxy("saiteja");
        authorizedProxy.accessResource();

        authorizedProxy = new SecurityProxy("admin");
        authorizedProxy.accessResource();
    }
}
