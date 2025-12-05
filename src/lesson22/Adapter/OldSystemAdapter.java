package lesson22.Adapter;

public class OldSystemAdapter implements AnalyticsTool{

    private OldDataSystem oldDataSystem;

    public OldSystemAdapter(OldDataSystem oldDataSystem) {
        this.oldDataSystem = oldDataSystem;
    }

    @Override
    public void collectData(String data) {
        // Uyğunlaşdırma: data (JSON) XML-ə çevrilir
        String xmlData = "<data>" + data + "</data>";
        oldDataSystem.recordXml(xmlData); // Köhnə metodu çağırır
    }



}
