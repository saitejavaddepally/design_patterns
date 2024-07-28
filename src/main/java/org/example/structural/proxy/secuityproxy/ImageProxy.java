package org.example.structural.proxy.secuityproxy;

import java.security.PrivilegedExceptionAction;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ImageProxy implements Image {

    private RealImage realImage;
    private final String fileName;

    private static final Map<String, RealImage> imageCache = new HashMap<>();

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override

    public void display() {
        realImage = imageCache.computeIfAbsent(fileName, RealImage::new);
        System.out.println(realImage);
        realImage.display();
    }


}
