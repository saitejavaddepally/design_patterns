package org.example.behavioural.command;

public class CommandDemo {

    CommandDemo(){
        test();
    }

    void test(){
        System.out.println("HELLO WORLD!");
    }

    public static void main(String[] args) {

        Light light = new Light();
        Switch lightSwitch = new Switch();

        Command toggleCommand = new ToggleCommand(light);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }
}
