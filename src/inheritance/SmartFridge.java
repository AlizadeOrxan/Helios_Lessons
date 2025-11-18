package inheritance;

public class SmartFridge extends SmartDevice{

    int coolingLevel;

    public SmartFridge(String brand, String model, boolean isOnline, int coolingLevel) {
        super(brand, model, isOnline);
        this.coolingLevel = coolingLevel;
    }

    @Override
    void connectToWifi() {
        System.out.println(brand + " " + model+ " " + "Connected to wifi");
    }

    @Override
    void disconnectFromWifi() {
        System.out.println(brand + "Disconnected from wifi");
    }
}
