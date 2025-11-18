package inheritance;

import javax.xml.namespace.QName;

public class SmartDevice {
    protected String brand;
    protected String model;
    protected boolean isOnline;

    public SmartDevice(String brand, String model, boolean isOnline) {
        this.brand = brand;
        this.model = model;
        this.isOnline = isOnline;
    }

    void connectToWifi(){
        System.out.println(brand + " Connected to wifi");

    }

    void disconnectFromWifi(){
        System.out.println(brand + " Disconnected from wifi");
    }
}
