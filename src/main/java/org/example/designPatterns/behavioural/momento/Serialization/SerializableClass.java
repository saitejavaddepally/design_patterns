package org.example.designPatterns.behavioural.momento.Serialization;

import java.io.Serializable;

public class SerializableClass implements Serializable {

    private static final long serialVersionUID = 1L;

    String name = "sai";
    String age = "23";
    transient String password = "randomPassword";


    public SerializableClass(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SerializableClass{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
