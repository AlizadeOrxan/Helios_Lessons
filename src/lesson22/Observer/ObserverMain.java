package lesson22.Observer;

public class ObserverMain {
    public static void main(String[] args) {

        NewAgency agency = new NewAgency();

        Student ali = new Student("Əli");
        Student ayten = new Student("Aytən");

        agency.addSubscriber(ali);
        agency.addSubscriber(ayten);
        agency.setNews("Followerlere melumat :  Yeni shekil Paylashmisham");

        agency.removeSubscriber(ayten); // Telebe ayrildi ve xeber yeniden yayimlandi

        agency.setNews("Followerlere melumat :  Yeni shekil Paylashmisham");


    }
}
