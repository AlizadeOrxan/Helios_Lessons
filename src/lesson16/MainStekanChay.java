package lesson16;

public class MainStekanChay {
    public static void main(String[] args) {


        Thread chay = new Thread(new TeaMaker());
        Thread glass = new Thread(new GlassMaker());

        chay.start();
        glass.start();


    }
}
