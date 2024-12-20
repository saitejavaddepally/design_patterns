package org.example.designPatterns.behavioural.command;

// concrete command
public class ToggleCommand implements Command {

    private final Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.toggle();
    }
}
