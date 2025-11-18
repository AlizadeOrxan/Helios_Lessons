package lesson1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Examples {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        Random rand = new Random();
//        int ranNum = rand.nextInt(1,100);
//        System.out.println("Ran " + ranNum);
//
//        int count = 3;
//        while (count!=0) {
//            System.out.println("Xahih edirem texmininizi yazin");
//            int texmin =  input.nextInt();
//
//            if (texmin == ranNum){
//                System.out.println("Tebrikler tapdiniz");
//                break;
//
//            }else {
//                System.out.println("Tapa bilmediniz");
//                count--;
//            }
//            System.out.println("Caniniz " + count);
//        }
//
//
//
//        String name = "banana";
//        int count = 0 ;
//        for (int i = 0 ; i< name.length() ; i++) {
//            if (name.charAt(i) == 'a'){
//                count++;
//            }
//
//        }
//        System.out.println("Tekrar olunan a herfi " + count);
//

        // for ( bashlangic noqtesi ; shert ; saygac )
                //    0   1  2  3  4  5 6  7

        for (int i = 1; i <= 5; i++) {
            for (int j= 1 ; j <= 5 ; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();

        }







    }
}
