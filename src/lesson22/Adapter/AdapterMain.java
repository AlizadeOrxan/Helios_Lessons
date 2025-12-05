package lesson22.Adapter;

public class AdapterMain {
    public static void main(String[] args) {


        AnalyticsTool newTool = new OldSystemAdapter(new OldDataSystem());

        newTool.collectData("user_id:123, event:login");






    }
}
