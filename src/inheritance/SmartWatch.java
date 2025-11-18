package inheritance;

public class SmartWatch extends SmartDevice{

    public SmartWatch(String brand, String model, boolean isOnline) {
        super(brand, model, isOnline);
    }


    void trackHeartRate(){
        System.out.println("Tracking heart rate");
    }

    @Override
    void connectToWifi() {
        super.connectToWifi();
    }

    @Override
    void disconnectFromWifi() {
        super.disconnectFromWifi();
    }
}
