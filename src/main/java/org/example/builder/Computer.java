package org.example.builder;

public class Computer {

    private final HDD diskSize;
    private final RAM ramSize;
    private final boolean hasUsbC;
    private final boolean hasGBWifi;

    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbC;
        private boolean hasGBWifi;

        public ComputerBuilder addDiskSize(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder addRamSize(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder addUsbC(boolean hasUsbC) {
            this.hasUsbC = hasUsbC;
            return this;
        }

        public ComputerBuilder addGBWifi(boolean hasGBWifi) {
            this.hasGBWifi = hasGBWifi;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }


    public Computer(ComputerBuilder builder) {
        diskSize = builder.diskSize;
        ramSize = builder.ramSize;
        hasUsbC = builder.hasUsbC;
        hasGBWifi = builder.hasGBWifi;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "diskSize=" + diskSize +
                ", ramSize=" + ramSize +
                ", hasUsbC=" + hasUsbC +
                ", hasGBWifi=" + hasGBWifi +
                '}';
    }
}
