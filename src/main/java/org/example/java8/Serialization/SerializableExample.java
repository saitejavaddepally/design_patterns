package org.example.java8.Serialization;

import java.io.*;

public class SerializableExample {

    public static void main(String[] args) {

        SerializableClass serializableClass = new SerializableClass("sai", "30", "343");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(serializableClass);
            System.out.println("Serialization successful!");
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            SerializableClass deserializedPerson = (SerializableClass) ois.readObject();
            System.out.println("Deserialization successful!");
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
