package org.example.designPatterns.structural.proxy.secuityproxy;

public class ProxyPattern {

    public static void main(String[] args) {

        Image proxyImage1 = new ImageProxy("sample.jpg");
        proxyImage1.display();

        System.out.println();

        Image proxyImage2 = new ImageProxy("sample.jpg");
        proxyImage2.display();
    }
}
