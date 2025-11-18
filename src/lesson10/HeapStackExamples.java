package lesson10;

public class HeapStackExamples {

    static int sum(int x , int a ){
        return x + a;
    }


    public static void call(){
        call();
    }
    public static void main(String[] args) {

      call();


    }
}
