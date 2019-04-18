
public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("2.4 GHz", "2 GB", "500 GB")
            .setGraphicsCardEnabled(true)
            .setBluetoothEnabled(true).build();
    }
}
