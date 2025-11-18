package lesson5;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {


        int[][] arr = {
                {12, 2, 3},
                {87, 5, 6},
                {1, 8, 96}
        };

        System.out.println("Sort olunmamish Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sort olunandan sonra");

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
    }



