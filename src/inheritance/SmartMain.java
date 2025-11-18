package inheritance;

public class SmartMain {
    public static void main(String[] args) {

        SmartDevice sm = new SmartDevice("Galaxy","S20",true);
        SmartFridge sf = new SmartFridge("Beko","10233",true,48);
        SmartSpeaker smp = new SmartSpeaker("JBL","TT500",true);
        SmartWatch smw = new SmartWatch("Apple","S9",true);

        sf.connectToWifi();
        smp.connectToWifi();
        smw.connectToWifi();

        smp.playMusic();
        smw.trackHeartRate();

        sf.disconnectFromWifi();
        smp.disconnectFromWifi();
        smw.disconnectFromWifi();


    }
}
