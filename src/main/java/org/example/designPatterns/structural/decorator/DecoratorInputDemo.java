package org.example.designPatterns.structural.decorator;

import java.io.*;

public class DecoratorInputDemo {

    public static void main(String[] args) throws Exception{

        File file = new File("./output.txt");
        System.out.println(file.getAbsolutePath());

        boolean wasCreated = file.createNewFile();

        System.out.println(wasCreated);

        OutputStream oStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(oStream);

        dataOutputStream.writeChars("Some text");

        dataOutputStream.close();
        oStream.close();

    }
}
