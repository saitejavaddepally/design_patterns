package org.example.designPatterns.SOLID.dsp.designed;


public class MacBook {

    private final Keyboard keyboard;
    private final Mouse wiredMouse;

    // very loose coupling, depended on interfaces
    public MacBook(Keyboard keyboard, Mouse wiredMouse) {
        this.keyboard = keyboard;
        this.wiredMouse = wiredMouse;
    }
}
