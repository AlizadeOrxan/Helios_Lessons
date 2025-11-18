package lesson1.ifelseStatements;

import java.util.Scanner;

public class Examples_Class {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // if else statements

//
//        int num1 , num2 ;
//        int min , max ;
//
//        System.out.println("Xahish edirem ilk ededi daxil edin");
//        num1 = scanner.nextInt();
//        System.out.println("Xahish edirem ikinci ededi daxil edin");
//        num2 = scanner.nextInt();
//
//        if (num1 > num2){
//            max = num1;
//            min = num2;
//        }else {
//            max = num2;
//            min = num1;
//        }
//
//
//        System.out.println("Daxil elediyiniz deyerin en boyuk olani " + max);
//        System.out.println("Daxil elediyiniz deyerin en kichik olani " + min);

//
//        System.out.println("Xahish edirem eded daxil edin");
//        int number = scanner.nextInt();

//        if (number > 0){
//            System.out.println("Daxil olunan eded musbetdir");
//
//            if (number % 2 == 0){
//                System.out.println("Daxil etdiyiniz eded cutdur");
//            }else {
//                System.out.println("Bu eded tekdir");
//            }
//
//
//        } else if (number < 0 ) {
//            System.out.println("Daxil etdiyiniz eded menfidir");
//
//        }else {
//            System.out.println("Daxil etdiyiniz eded 0-a beraberdir");
//        }

//
//        int age ;
//        boolean valideynVarMi ;
//
//        System.out.println("Zehmet olmazsa yashinizi daxil edin");
//        age = scanner.nextInt();
//        System.out.println("Valideyniniz ile birlikdesiniz ? | true/false");
//        valideynVarMi = scanner.nextBoolean();
//
//        if (age >= 18){
//            System.out.println("Siz butun filmlere baxa bilersiniz");
//        }else {
//            if(valideynVarMi) {
//                System.out.println("Siz valideyninizle Deli Kur filmine baxa bilersiniz");
//            }else {
//                System.out.println("Ushag uchun olan filmlere baxa bilersiniz");
//            }
//        }
//
//
//       int number = 15 ;
//       double secondNumber = number ;
//
//        System.out.println("Int olan eded " + number);
//        System.out.println("Double olan eded " +  secondNumber);

//
//
//        double number1 = 15.87;
//        int doubleToInteger = (int) number1 ;
//
//        System.out.println("double olan " + number1);
//        System.out.println("Double kechib int oldu " + doubleToInteger);
//

//
//        char symbol = 'W';
//        int asd = symbol;
//
//        System.out.println("Symbol " + symbol);
//        System.out.println("Symbol qarshiligi " + asd);
//
//
//
//        int ch = 96 ;
//        char symbol1 = (char) ch ;
//
//        System.out.println("Integer ededi " + ch);
//        System.out.println("Integer qarshiligi olan simvol " + symbol1);
//
//

//
//
//        char asd = 'a' - 'R' ;
//        System.out.println((int) asd);
//


        String str = "123" ;
        int stringToInteger = Integer.parseInt(str);

        System.out.println("String olan " + str);
        System.out.println("Stringden Integere " +  (stringToInteger + 5));



        int num = 123 ;
        String integerToString = Integer.toString(num);
        System.out.println("Integer olan " + num);
        System.out.println("Integerdan Stringe " + (integerToString + 5));


    }
}
