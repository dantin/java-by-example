
public class Computer {

    // required parameters.
    private String hdd;
    private String ram;
    private String cpu;

    // optional parameters.
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.cpu = builder.cpu;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public String getHDD() {
        return hdd;
    }

    public String getRAM() {
        return ram;
    }

    public String getCPU() {
        return cpu;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public static class ComputerBuilder {

        // required parameters.
        private String hdd;
        private String ram;
        private String cpu;

        // optional parameters.
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String cpu, String ram, String hdd) {
            this.cpu = cpu;
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean value) {
            this.isGraphicsCardEnabled = value;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean value) {
            this.isBluetoothEnabled = value;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
