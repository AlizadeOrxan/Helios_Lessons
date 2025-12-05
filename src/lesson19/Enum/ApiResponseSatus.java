package lesson19.Enum;

public enum ApiResponseSatus {

    SUCCESS(200,"Ugurla emeliyyat icra edildi"),
    REDIRECTION(301,"Diger Servere yonlendirilirsiniz"),
    BAD_REQUEST(400,"Xeta bash verdi"),
    NOT_FOUND(404,"Kontekst tapilmadi"),
    INTERNAL_SERVER_ERROR(500,"Server xetasi , kodlarinizi izeyin");


   final int statusCode;
   final String message;

    ApiResponseSatus(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }


    public static void responseBody(ApiResponseSatus status) {
        System.out.println("Status messag is -> " + status.message);
        System.out.println("Status code is -> " + status.statusCode);
    }

    public static void apiRequest(ApiResponseSatus api) {
        switch (api){
            case SUCCESS:
                System.out.println("Ugurla icra olunud");
                break;
            case REDIRECTION:
                System.out.println("Diger Servere yonlendirilirsiniz");
                break;
        }
    }


}
