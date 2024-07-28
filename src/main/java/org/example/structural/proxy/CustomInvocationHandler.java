package org.example.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler<T> implements InvocationHandler {

    private T t;
    String username;

    public CustomInvocationHandler(T t, String username){
        this.t = t;
        this.username = username;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = null;
        System.out.println("Before method invocation");
        if (username.equalsIgnoreCase("admin")) {
            result = method.invoke(t, args);
        }
        else {
            System.out.println("Unable to invoke the method .. ");
        }

        System.out.println("After method invocation");

        return result;
    }

}
