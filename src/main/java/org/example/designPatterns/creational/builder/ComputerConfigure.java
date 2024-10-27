package org.example.designPatterns.creational.builder;

public class ComputerConfigure {

    public static void main(String[] args) {

        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
        builder.addDiskSize(HDD.DEFAULT).addRamSize(RAM.DEFAULT).addGBWifi(true).addUsbC(true);

        Computer computer = builder.build();

        System.out.println(computer);
    }
}
