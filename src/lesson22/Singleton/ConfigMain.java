package lesson22.Singleton;

import lesson6.Book;

public class ConfigMain {
    public static void main(String[] args) {


        ConfigurationManager config1 = ConfigurationManager.getInstance();

        config1.connect();

        ConfigurationManager config2 = ConfigurationManager.getInstance();

        if (config1 == config2){
            System.out.println("Configler eyni obyekt unvani dashiyir , Singleton ishleyir ");
        }else {
            System.out.println("Xeta bash verdi ");
        }

        config2.disconnect();

        System.out.println(config1 + " " + config2);


    }
}
