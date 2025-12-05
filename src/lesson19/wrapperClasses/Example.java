package lesson19.wrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {


//        int id ; // hech vaxt null ola bilmez
//        Integer id = null;
//        int id = null


        //Stringi inte chevirmek
//        String str = "123";
//
//        int result = Integer.parseInt(str);
//
//        System.out.println(result + 5 );


        //int deyerini Stringe chevirmek
//        int intToStr = 15 ;
//        String result = String.valueOf(intToStr);
//
//        System.out.println(result + 15);
//

//
//        Integer a = 128 ;
//        Integer b = 128;
//
//        System.out.println(a == b );
//        System.out.println(a.equals(b));
//



        List<Double> list = new ArrayList<>();

        list.add(1.0);
        list.add(2.0);
        list.add(3.0);


        double totalSum = 0;

        for (Double d : list) {
            totalSum += d;
        }
        System.out.println(totalSum);


    }
}
