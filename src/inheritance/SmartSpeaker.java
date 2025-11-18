package inheritance;

public class SmartSpeaker extends SmartDevice{
    public SmartSpeaker(String brand, String model, boolean isOnline) {
        super(brand, model, isOnline);
    }

    void playMusic(){
        System.out.println("Playing music");
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
