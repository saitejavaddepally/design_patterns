package org.example.designPatterns.structural.proxy.secuityproxy;

import java.util.HashMap;
import java.util.Map;

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
