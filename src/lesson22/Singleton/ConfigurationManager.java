package lesson22.Singleton;

public class ConfigurationManager {

    private static ConfigurationManager instance;


    // 2. Private constructor
    private ConfigurationManager() {
        // Konfiqurasiya faylını yükləyir (bahalı əməliyyat ola bilər)
        System.out.println("ConfigurationManager Singleton olaraq yaradildi");
    }

    // 3. Static access method
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            // Thread-safe olmaq üçün əlavə işləmələr lazımdır, lakin bu əsas ideyadır
            instance = new ConfigurationManager();
        }
        return instance;
    }


    void connect(){
        System.out.println("Connecting to database...");
    }

    void  disconnect(){
        System.out.println("Disconnecting from database...");
    }
}
