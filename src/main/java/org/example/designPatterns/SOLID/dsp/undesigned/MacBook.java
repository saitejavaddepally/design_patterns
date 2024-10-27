package org.example.designPatterns.SOLID.dsp.undesigned;

public class MacBook {

    private final WiredKeyboard keyboard;
    private final WiredMouse wiredMouse;

    // very tight coupling, depend on interfaces
    public MacBook(WiredKeyboard keyboard, WiredMouse wiredMouse) {
        this.keyboard = new WiredKeyboard();
        this.wiredMouse = new WiredMouse();
    }
}
