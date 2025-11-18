package lesson4;

import java.util.Scanner;

public class ArraysExamples {
    public static void main(String[] args) {

        // data_type [] variable = {};
        //   0      1       2

        int [] arr = {5,10,20,40,30};

        int max = arr[0];
        int min = arr[0];

       for (int i = 0 ; i < arr.length; i++){
           if (arr[i] > max){
               max = arr[i];
           }else if (arr[i] < min){
               min = arr[i];
           }
           System.out.print(arr[i] + " ");
       }

        System.out.println("\n Min " + min + " Max " + max);



    }
}