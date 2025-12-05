package lesson19.Enum;

public class Mainenum {

//    enum HefteninGunleri {
//        MONDAY , TUESDAY , THURSDAY , FRIDAY , SATURDAY
//    }

    public static void main(String[] args) {

//        ApiResponseSatus[] api = ApiResponseSatus.values();
//      chapa verib butun deyerleri almaq
//        for (ApiResponseSatus api : ApiResponseSatus.values()) {
//            System.out.println(api);
//        }

//            ApiResponseSatus api = ApiResponseSatus.SUCCESS;
//        System.out.println(api);

        // CI olduqdan sonra output
//        for (ApiResponseSatus api : ApiResponseSatus.values()) {
//            System.out.println(api.statusCode + " " + api.message);
//        }
//
//        System.out.println("____________________");
//
//
//        for (ApiResponseSatus api : ApiResponseSatus.values()) {
//            System.out.println(api.statusCode + " " + api.message);
//        }

//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Zehmet olmazsa heftenin gununu qeyd edin ");
//        String day =  scanner.nextLine();
//
//
//        try {
//
//            HefteninGunleri dayofTheWeek = HefteninGunleri.valueOf(day.toUpperCase());
//
//            switch (dayofTheWeek) {
//                case MONDAY:
//                    System.out.println("1 ci gun");
//                    break;
//                case TUESDAY:
//                    System.out.println("2ci gun");
//                default:
//                    System.out.println("Xeta !");
//            }
//
//        }catch (IllegalArgumentException e) {
//            System.out.println("Xeta bash verdi duzgun soz yazin");
//        }

        // Enum-larin daxilinde metod istifadesi
//        ApiResponseSatus api = ApiResponseSatus.SUCCESS;
//        System.out.println(api.statusCode);
//        System.out.println(api.message);
//
//        OperationEnum operationEnum = OperationEnum.PLUS;
//        System.out.println(operationEnum.calculate(10, 5
//        ));
//
//        OperationEnum operationEnum2 = OperationEnum.MULTIPLY;
//        System.out.println(operationEnum2.calculate(5, 5));



//        // Static method istifade ederek
//        ApiResponseSatus.responseBody(ApiResponseSatus.BAD_REQUEST);
//        ApiResponseSatus.apiRequest(ApiResponseSatus.REDIRECTION);
//

//        //indeksine uygun olaraq siralama
//        for (ApiResponseSatus api : ApiResponseSatus.values()) {
//            System.out.println(api.name() + " " + api.ordinal());
//        }

        //array uzunlugunu vermek uchun
//        ApiResponseSatus[] api = ApiResponseSatus.values();
//
//        System.out.println(api.length);



        //indeksini deyishmek
//        ApiResponseSatus[] api = ApiResponseSatus.values();
//
//        api[0] = ApiResponseSatus.REDIRECTION;
//
//        System.out.println(api[0]);






    }
}
