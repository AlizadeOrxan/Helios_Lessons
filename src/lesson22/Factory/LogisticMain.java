package lesson22.Factory;

public class LogisticMain {
    public static void main(String[] args) {

        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();


        roadLogistics.planDelivery();
        seaLogistics.planDelivery();




    }
}
