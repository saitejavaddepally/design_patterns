package org.example.designPatterns.structural.behavioural.command;

//invoker
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }

}
