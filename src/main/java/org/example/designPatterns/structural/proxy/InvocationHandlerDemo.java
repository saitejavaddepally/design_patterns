package org.example.designPatterns.structural.proxy;

import java.lang.reflect.Proxy;

public class InvocationHandlerDemo {

    public static void main(String[] args) {

        CustomServiceImpl customService = new CustomServiceImpl();

        CustomInvocationHandler<CustomService> customHandler = new CustomInvocationHandler<>(customService, "saiteja");

        CustomService proxyService = (CustomService) Proxy.newProxyInstance(
                customService.getClass().getClassLoader(),
                new Class[] {CustomService.class},
                customHandler
        );

        proxyService.doServiceCall();
    }
}
